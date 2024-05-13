import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int M = sc.nextInt();
            int[][] M1 = new int[M][M];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    M1[i][j] = sc.nextInt();
                }
            }
            int N = sc.nextInt();
            int[][] M2 = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M2[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i <= M - N; i++) {
                for (int j = 0; j <= M - N; j++) {
                    if (isEqual(M1, M2, i, j, N)) {
                        replace(M1, i, j, N);
                    }
                }
            }
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(M1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    private static boolean isEqual(int[][] M1, int[][] M2, int x, int y, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (M1[x + i][y + j] != M2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void replace(int[][] M1, int x, int y, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                M1[x + i][y + j] = -1; // use -1 to represent '*'
            }
        }
    }
}