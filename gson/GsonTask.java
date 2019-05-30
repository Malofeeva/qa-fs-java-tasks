import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class GsonTask {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к файлу с расширением json:");
        String pathToJson = in.nextLine();
        File jsonFile = new File(pathToJson);
        if (!jsonFile.exists()) {
            System.out.println("Указанный файл не существует");
            return;
        }

        String jsonString = FileUtils.readFileToString(jsonFile);
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

        try {
            if (jsonString.startsWith("{")) {
                File animalSchemaFile = new File(GsonTask.class.getResource("animalSchema.json").toURI());
                String animalSchemaString = FileUtils.readFileToString(animalSchemaFile);
                JSONObject jsonSchema = new JSONObject(new JSONTokener(animalSchemaString));
                JSONObject jsonSubject = new JSONObject(new JSONTokener(jsonString));
                Schema schema = SchemaLoader.load(jsonSchema);
                schema.validate(jsonSubject);

                Animal animal = gson.fromJson(jsonString, Animal.class);
                System.out.println(animal);
                System.out.println(gson.toJson(animal));
            }
            else if (jsonString.startsWith("[")) {
                File animalsSchemaFile = new File(GsonTask.class.getResource("animalsSchema.json").toURI());
                String animalsSchemaString = FileUtils.readFileToString(animalsSchemaFile);
                JSONObject jsonSchema = new JSONObject(new JSONTokener(animalsSchemaString));
                JSONArray jsonSubject = new JSONArray(new JSONTokener(jsonString));
                String pathToResources = GsonTask.class.getProtectionDomain().getCodeSource().getLocation().getPath();
                Schema schema = SchemaLoader.builder()
                        .resolutionScope("file:" + pathToResources)
                        .schemaJson(jsonSchema).build().load().build();
                schema.validate(jsonSubject);

                List<Animal> animals = gson.fromJson(jsonString, List.class);
                System.out.println(animals);
                System.out.println(gson.toJson(animals));
            }
            else {
                System.out.println("Неверный формат файла");
            }
        }
        catch (ValidationException e) {
            System.out.println("Неверный формат файла");
        }
    }
}
