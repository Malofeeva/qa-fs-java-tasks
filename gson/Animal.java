import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class Animal {

    @SerializedName("animal_type")
    public String animalType;
    public String name;
    public Integer age;
    @SerializedName("has_tail")
    public Boolean hasTail;
    public List<String> colors;
    public Map<String, Object> friends;


    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hasTail=" + hasTail +
                ", colors=" + colors +
                ", friends=" + friends +
                '}';
    }
}
