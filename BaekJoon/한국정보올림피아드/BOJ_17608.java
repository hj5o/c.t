package BaekJoon.한국정보올림피아드;

import java.util.Scanner;

public class BOJ_17608 { // 막대기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 1;
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[arr.length-1];
        for (int i=N-2; i>=0; i--) {
            if (arr[i] > max) {
                cnt++;
                max = Math.max(max, arr[i]);
            }
        }
        System.out.println(cnt);
    }
}
