public class MyCharSequence implements CharSequence {

    private final String charSequence;

    MyCharSequence(String charSequence) {
        this.charSequence = charSequence;
    }

    @Override
    public int length() {
        return charSequence.length();
    }

    @Override
    public char charAt(int index) {
        return charSequence.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end){
        return charSequence.subSequence(start, end);
    }

    @Override
    public String toString() {
        return charSequence;
    }

    public static void main(String[] args) {
        CharSequence chars = new MyCharSequence("YesYesYes");
        System.out.println("chars = " + chars);
        System.out.println("chars.charAt(7) = " + chars.charAt(7));
        System.out.println("chars.length() = " + chars.length());
        System.out.println("chars.subSequence(0,5) = " + chars.subSequence(0,5));
    }
}
