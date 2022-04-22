package BaekJoon.BASIC;
/*
       Problem 15649 N과 M (1)
import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;
    public static boolean[] vis;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        vis = new boolean[N];
        arr = new int[M];
        dfs(N,M,0);
        System.out.println(sb);
    }
    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=0; i<N; i++) {
            if (!vis[i]) {
                vis[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                vis[i] = false;
            }
        }
    }
}
*/

