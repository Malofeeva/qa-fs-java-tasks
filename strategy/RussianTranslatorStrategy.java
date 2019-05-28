package strategy;

import java.util.HashMap;
import java.util.Map;

public class RussianTranslatorStrategy implements TranslatorStrategy {

    private final Map<String, String> dictionary = new HashMap<>();

    public RussianTranslatorStrategy() {
        dictionary.put("world", "мир");
        dictionary.put("green", "зеленый");
        dictionary.put("red", "красный");
    }

    @Override
    public String translate(String word) {
        return dictionary.get(word.toLowerCase());
    }
}
