
import java.util.Scanner;

public class NumberOfWays {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int R = scanner.nextInt();
            int C = scanner.nextInt();
            int[][] matrix = new int[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.out.println(numberOfWays(matrix, R, C));
        }
    }

    private static int numberOfWays(int[][] matrix, int R, int C) {
        if (matrix[0][0] == 1 || matrix[R - 1][C - 1] == 1) {
            return 0;
        }
        int[][] dp = new int[R][C];
        dp[0][0] = 1;
        for (int i = 1; i < R; i++) {
            if (matrix[i][0] == 0) {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int j = 1; j < C; j++) {
            if (matrix[0][j] == 0) {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[R - 1][C - 1];
    }
}

/**
 Example 
 Input/Output 1: 
 Input: 
 4 5 
 0 0 0 0 0 
 1 0 0 1 0 
 0 0 0 1 1 
 0 1 0 0 0 
 Output: 3
 */
