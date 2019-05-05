public class Task3 {

    public static void main(String[] args) {
        int matrixSize = 5;
        int[][] balances = new int[matrixSize][];

        for (int i = 0; i < matrixSize; i++) {
            balances[i] = new int[matrixSize];
            for (int j = 0; j < matrixSize; j++) {
                balances[i][j] = i * 10 + j;
            }
        }
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i < j) {
                    balances[i][j] = balances[i][j] + balances[j][i];
                    balances[j][i] = balances[i][j] - balances[j][i];
                    balances[i][j] = balances[i][j] - balances[j][i];
                }
            }
        }
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(balances[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}


