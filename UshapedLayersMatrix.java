import java.util.Scanner;

public class UshapedLayersMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        printULayers(matrix, R, C);
    }

    private static void printULayers(int[][] matrix, int R, int C) {
        int top = 0, bottom = R - 1, left = 0, right = C - 1;
        while (left < right && bottom >= 0) {
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][left] + " ");
            }
            for (int i = left + 1; i <= right; i++) {
                System.out.print(matrix[bottom][i] + " ");
            }
            for (int i = bottom - 1; i > top; i--) {
                System.out.print(matrix[i][right] + " ");
            }
            System.out.println();
            bottom--; left++; right++;
        }
    }
}