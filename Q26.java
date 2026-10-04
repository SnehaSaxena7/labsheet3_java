import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];

        System.out.println("Enter matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Upper Triangular Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i <= j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("Lower Triangular Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
