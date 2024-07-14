
import java.util.Scanner;

public class NumberOfMarkets {

    private static int R, C;
    private static int[][] city;
    private static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();

        city = new int[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                city[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int marketCount = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (city[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    marketCount++;
                }
            }
        }

        System.out.println(marketCount);
    }

    private static void dfs(int row, int col) {
        if (row < 0 || col < 0 || row >= R || col >= C || city[row][col] == 0 || visited[row][col]) {
            return;
        }

        visited[row][col] = true;

        // Explore all four possible directions (up, down, left, right)
        dfs(row - 1, col);
        dfs(row + 1, col);
        dfs(row, col - 1);
        dfs(row, col + 1);
    }
}
