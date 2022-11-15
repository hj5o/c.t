package SWEA.LEVEL_D.etc.READY_FOR_SSAFY;

import java.util.*;

public class BOJ_2559 { // 수열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = Integer.MIN_VALUE;
        for (int i=0; i<=N-K; i++) {
            int sum = 0;
            for (int j=i; j<i+K; j++) {
                sum += arr[j];
            }
            answer = Math.max(sum, answer);
        }
        System.out.println(answer);
    }
}