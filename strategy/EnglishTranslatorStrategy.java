package strategy;

import java.util.HashMap;
import java.util.Map;

public class EnglishTranslatorStrategy implements TranslatorStrategy {

    private final Map<String, String> dictionary = new HashMap<>();

    public EnglishTranslatorStrategy() {
        dictionary.put("мир", "world");
        dictionary.put("зеленый", "green");
        dictionary.put("красный", "red");
    }

    @Override
    public String translate(String word) {
        return dictionary.get(word.toLowerCase());
    }
}
