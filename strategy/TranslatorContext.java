package strategy;

public class TranslatorContext {

    private TranslatorStrategy translatorStrategy;

    public TranslatorContext(TranslatorStrategy translatorStrategy) {
        setTranslatorStrategy(translatorStrategy);
    }

    public void setTranslatorStrategy(TranslatorStrategy translatorStrategy) {
        this.translatorStrategy = translatorStrategy;
    }

    public String executeStrategy(String word) {
        String translation = translatorStrategy.translate(word);
        if (translation == null) {
            return "В словаре данного слова нет";
        }
        return translation;
    }
}
