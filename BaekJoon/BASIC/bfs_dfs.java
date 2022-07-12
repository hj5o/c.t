package BaekJoon.BASIC;

       Problem 1926 그림
import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int cnt;
    static int[] area;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        visited = new boolean[N][M];
        area = new int[N*M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        Arrays.sort(area);
        System.out.println(cnt);
        System.out.println(area[area.length-1]);
    }
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        int nx, ny;
        area[cnt]++;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (board[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
