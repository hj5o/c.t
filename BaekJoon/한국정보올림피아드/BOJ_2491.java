package BaekJoon.한국정보올림피아드;

import java.util.Scanner;

public class BOJ_2491 { // 수열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int [N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int u_cnt = 1;
        int u_max = 1;
        int d_cnt = 1;
        int d_max = 1;
        for (int i=0; i<N-1; i++) {
            if (arr[i] <= arr[i+1]) {
                u_cnt++;
            } else {
                u_cnt = 1;
            }
            u_max = Math.max(u_cnt, u_max);
        }
        for (int i=0; i<N-1; i++) {
            if (arr[i] >= arr[i+1]) {
                d_cnt++;
            } else {
                d_cnt = 1;
            }
            d_max = Math.max(d_cnt, d_max);
        }
        System.out.println(Math.max(d_max, u_max));
    }
}
