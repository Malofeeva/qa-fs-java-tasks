import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите количество играков для начала игры:");
            int playersNumber = input.nextInt();
            if (playersNumber == 1) {
                System.out.println("Я загадываю число от 0 до 9");
                int number = (int) (Math.random() * 10);
                System.out.println("Введите число:");
                int i = input.nextInt();
                while (i != number) {
                    System.out.println("Вы не угадали число, введите число:");
                    i = input.nextInt();
                }
                System.out.println("Вы угадали число");
            }
            else if (playersNumber == 2) {
                System.out.println("Я загадываю число от 0 до 9");
                int number = (int) (Math.random() * 10);
                System.out.println("Предположение первого игрока:");
                int i1 = input.nextInt();
                System.out.println("Предположение второго игрока:");
                int i2 = input.nextInt();
                while (i1 != number && i2 != number) {
                    System.out.println("Оба игрока не угадали число.");
                    System.out.println("Предположение первого игрока:");
                    i1 = input.nextInt();
                    System.out.println("Предположение второго игрока:");
                    i2 = input.nextInt();
                }
                if (i1 == number) {
                    System.out.println("Первый игрок угадал число");
                }
                if (i2 == number) {
                    System.out.println("Второй игрок угадал число");
                }
            }
            else {
                System.out.println("Максимально количество игроков - 2");
            }

            System.out.println();
            System.out.println("Чтобы сыграть еще раз введите \"да\":");
            String answer = input.next();
            if (!"да".equalsIgnoreCase(answer)) {
                break;
            }
            System.out.println();
        }
    }

}
