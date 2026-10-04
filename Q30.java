import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int zero = 0, nonZero = 0;

        System.out.println("Enter matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        if (zero > nonZero)
            System.out.println("The matrix is a sparse matrix.");
        else
            System.out.println("The matrix is not a sparse matrix.");
    }
}
