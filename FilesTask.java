import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FilesTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите директорию");
        String fileDirectory = in.nextLine();
        Path directoryPath = Paths.get(fileDirectory);
        try {
            System.out.println("Для удаления директории введите 1, для записи строк в файл введите 2:");
            String userAnswer = in.nextLine();
            if ("1".equals(userAnswer)) {
                //Удаление директории
                if (Files.exists(directoryPath)) {
                    Files.walk(directoryPath)
                            .sorted(Comparator.reverseOrder())
                            .map(Path::toFile).forEach(File::delete);
                } else {
                    System.out.println("Невозможно произвести удаление, так как указанной дирректории не существует");
                }
            }
            else if ("2".equals(userAnswer)) {
                //Запись строк в файл
                if (Files.exists(directoryPath)) {
                    System.out.println("Указанная директория уже существует");
                } else {
                    Files.createDirectory(directoryPath);
                }
                System.out.println("Введите имя файла");
                String fileName = in.nextLine();
                Path filePath = Paths.get(fileDirectory, fileName);
                if (Files.exists(filePath)) {
                    System.out.println("Указанный файл уже существует");
                } else {
                    Files.createFile(filePath);
                }

                List<String> lines = new ArrayList<>();
                System.out.println("Для завершения ввода введите пустую строку");
                while (true) {
                    System.out.println("Введите строку:");
                    userAnswer = in.nextLine();
                    if (userAnswer.isEmpty()) {
                        break;
                    }
                    lines.add(userAnswer);
                }
                Files.write(filePath, lines);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e);
        }
    }
}
