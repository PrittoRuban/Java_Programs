
import java.util.Scanner;

public class CheckTriangleInMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <= N / 2; i++) {
            if (matrix[i][N / 2 - i] != K || matrix[i][N / 2 + i] != K) {
                System.out.println("NO");
                return;
            }
        }

        for (int j = 0; j < N; j++) {
            if (matrix[N / 2][j] != K) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
