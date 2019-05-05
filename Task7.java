import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер месяца:");
            int month = input.nextInt();
            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Неверно указан номер месяца");
            }

            System.out.println();
            System.out.println("Чтобы определить еще один месяц введите \"да\":");
            String answer = input.next();
            if (!"да".equalsIgnoreCase(answer)) {
                break;
            }
            System.out.println();
        }
    }

}
