import java.util.Arrays;
import java.util.Scanner;

public class StringsTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:".trim());
        String string = in.nextLine();
        if (string.isEmpty()) {
            System.out.println("Введена пустая строка");
            return;
        }

        char[] chars = string.toCharArray();

        //Удаление лишних пробелов
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] == ' ') {
                start++;
                continue;
            }
            if (chars[end] == ' ') {
                end--;
                continue;
            }
            break;
        }
        chars = Arrays.copyOfRange(chars, start, end + 1);
        string = string.trim();
        if (string.isEmpty()) {
            System.out.println("Введенная строка содержит только пробелы");
            return;
        }
        System.out.print("Строка без пробелов: ");
        System.out.println(chars);

        //Разворот строки, char
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        System.out.print("Разворот строки (последовательность char): ");
        System.out.println(chars);

        //Разворот строки, объект StringBuilder
        StringBuilder reverseString = new StringBuilder(string);
        reverseString.reverse();
        System.out.println("Разворот строки при помощи объекта StringBuilder: " + reverseString);

        //Приведение всех символов строки к верхнему регистру
        String upperString = string.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperString);

        //Извлечение подстроки
        int startIndex;
        int endIndex;
        while (true) {
            System.out.println("Введите начальный индекс:");
            startIndex = in.nextInt();
            System.out.println("Введите конечный индекс:");
            endIndex = in.nextInt();
            if (startIndex >= string.length() || endIndex > string.length() || startIndex > endIndex) {
                System.out.println("Неверно введены индексы!\n");
                continue;
            }
            break;
        }
        System.out.print("Результат извлечения подстроки с " + startIndex + " индекса по " + endIndex + ": "
                + string.substring(startIndex, endIndex));
    }
}
