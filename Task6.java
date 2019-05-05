public class Task6 {

        public static void main(String[] args) {
            int number = (int) (Math.random() * 100);
            int sum = 1;
            for (int n = 2; sum < number; n++){
                sum += n;
            }
            String result = sum == number ? "можно" : "нельзя";
            System.out.println("Число " + number + " " + result + " представить в виде частичной суммы натурального ряда");
        }

}

