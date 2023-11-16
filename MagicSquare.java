import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();

        int[][] magicSquare = new int[n][n];

        if (n % 2 != 0) {
            int row = n / 2;
            int col = n - 1;

            for (int num = 1; num <= n * n; ) {
                if (row == -1 && col == n) {
                    row = 0;
                    col = n - 2;
                } else {
                    if (col == n) {
                        col = 0;
                    }
                    if (row < 0) {
                        row = n - 1;
                    }
                }
                if (magicSquare[row][col] != 0) {
                    col -= 2;
                    row++;
                    continue;
                } else {
                    magicSquare[row][col] = num++;
                }
                row--;
                col++;
            }
        } else {
            int i, j;
            for ( i = 0; i < n; i++)
                for ( j = 0; j < n; j++)
                    magicSquare[i][j] = (n*i) + j + 1;

            for ( i = 0; i < n/4; i++)
                for ( j = 0; j < n/4; j++)
                    magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];

            for ( i = 0; i < n/4; i++)
                for ( j = 3 * (n/4); j < n; j++)
                    magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];

            for ( i = 3 * n/4; i < n; i++)
                for ( j = 0; j < n/4; j++)
                    magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];

            for ( i = 3 * n/4; i < n; i++)
                for ( j = 3 * n/4; j < n; j++)
                    magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];

            for ( i = n/4; i < 3 * n/4; i++)
                for ( j = n/4; j < 3 * n/4; j++)
                    magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];
        }

        System.out.println("The Magic Square of size " + n + "x" + n + " is:");
        for (int[] row : magicSquare) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
