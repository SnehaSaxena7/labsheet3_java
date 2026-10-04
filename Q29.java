import java.util.Scanner;

class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int n = sc.nextInt();
            a[i] = new int[n];

            System.out.println("Enter elements:");
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                for (int k = 0; k < a[i].length - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted Jagged Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
