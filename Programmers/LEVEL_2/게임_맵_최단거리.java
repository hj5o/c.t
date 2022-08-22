package Programmers.LEVEL_2;

/*
import java.util.*;

class Solution {
    static int[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, M;
    public int solution(int[][] maps) {
        int answer = 0;
        N = maps.length;
        M = maps[0].length;
        visited = new int[N][M];
        bfs(maps, visited);
        answer = visited[N-1][M-1];
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
    public static void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] c = q.poll();
            int cx = c[0];
            int cy = c[1];

            for (int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (visited[nx][ny] == 0 && maps[nx][ny] != 0) {
                        visited[nx][ny] = visited[cx][cy] + 1;
                        q.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}
*/

