public class Task4 {

    public static void main(String[] args){
        int k = 3;
        String[] array = new String[99];
        for (int i = 0; i < array.length; i++) {
            int number = (int) (Math.random() * 90 + 10);
            array[i] = String.valueOf(number);
        }
        String sequence = String.join("", array);
        System.out.println("Последовательность чисел:");
        System.out.println(sequence);
        System.out.println(k + "-я цифра последовательности: " + sequence.charAt(k - 1));
    }

}
