public class Task5 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 12 == 0)
                count++;
        }
        System.out.println("Количество чисел, кратных 12, в промежутке от " + a + " до " + b + " равно: " + count);
    }

}
