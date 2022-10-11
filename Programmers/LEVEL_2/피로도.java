/*
package Programmers.LEVEL_2;

class Solution {
    static boolean[] visited;
    static int answer;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        return answer;
    }
    static void dfs(int[][] dungeons, int k, int cnt) {
        answer = Math.max(answer, cnt);
        for (int i=0; i<dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                k -= dungeons[i][1];
                dfs(dungeons, k, cnt+1);
                visited[i] = false;
                k += dungeons[i][1];
            }
        }
    }
}
*/
