public class Task1 {

    public static void main(String[] args) {
        for (int i = 99; i >= 0; i--) {
            if (i > 2) {
                System.out.println(i + " bottles of beer on the wall,");
                System.out.println(i + " bottles of beer!");
                System.out.println("Take one down, pass it around,");
                System.out.println((i - 1) + " bottles of beer on the wall!");
            }
            else if (i == 2) {
                System.out.println(i + " bottles of beer on the wall,");
                System.out.println(i + " bottles of beer!");
                System.out.println("Take one down, pass it around,");
                System.out.println((i - 1) + " bottle of beer on the wall!");
            }
            else if (i == 1) {
                System.out.println(i + " bottle of beer on the wall,");
                System.out.println(i + " bottle of beer!");
                System.out.println("Take one down, pass it around,");
                System.out.println("No more bottles of beer on the wall!");
            }
            else {
                System.out.println("No more bottles of beer on the wall,");
                System.out.println("No more bottles of beer!");
                System.out.println("Go to the store and buy some more,");
                System.out.println("99 bottles of beer on the wall.");
            }
            System.out.println();
        }
    }

}
