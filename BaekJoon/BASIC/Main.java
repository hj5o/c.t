package BaekJoon.BASIC;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
///*
//계단 오르기 문제와 비슷하다.
//다만 계단 오르기는 마지막 계단을 반드시 밟아야했는데, 포도주 시식문제는 그런 조건 없다.
//따라서 이전 dp와 비교하여 최댓값을 갱신해야한다.
//*/
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] dp = new int[N];
//        int[] arr = new int[N];
//
//        for (int i=0; i<N; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        dp[0] = arr[0];
//        dp[1] = arr[0] + arr[1];
//        dp[2] = Math.max(dp[1], Math.max(dp[0] + arr[2], arr[1] + arr[2]));
//        for (int i=3; i<N; i++) {
//            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
//        }
//        System.out.println(dp[N-1]);
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 첫잔일 경우
        if (N >= 1) {
            dp[0] = arr[0];
        }
        // 두잔일 경우
        if (N >= 2) {
            dp[1] = arr[0] + arr[1];
        }
        // 세잔일 경우
        if (N >= 3) {
            dp[2] = Math.max(dp[1], Math.max(dp[0] + arr[2], arr[1] + arr[2]));
        }
        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }
        System.out.println(dp[N - 1]);
    }
}