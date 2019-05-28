package strategy;

import java.util.Scanner;

public class StrategyExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        TranslatorStrategy englishStrategy = new EnglishTranslatorStrategy();
        TranslatorStrategy russianStrategy = new RussianTranslatorStrategy();

        TranslatorContext translator = new TranslatorContext(englishStrategy);

        System.out.println("Команды для перевода языков: \"?rus-eng\", \"?eng-rus\"");
        System.out.println("Команда для выхода из программы: \"?stop\"");
        while (true) {
            System.out.println("Введите слово для перевода:");
            String word = in.nextLine();
            if ("?rus-eng".equalsIgnoreCase(word)) {
                translator.setTranslatorStrategy(englishStrategy);
                System.out.println("Режим ввода переведён на rus-eng");
            } else if ("?eng-rus".equalsIgnoreCase(word)) {
                translator.setTranslatorStrategy(russianStrategy);
                System.out.println("Режим ввода переведён на eng-rus");
            } else if ("?stop".equalsIgnoreCase(word)) {
                break;
            } else {
                String translate = translator.executeStrategy(word);
                System.out.println(translate);
            }

        }
    }
}
