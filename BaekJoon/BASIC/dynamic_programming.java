package BaekJoon.BASIC;
/*
       Problem 1463 1로 만들기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[1] = 0;
        for (int i=2; i<=N; i++) {
            dp[i] = dp[i-1] + 1;
            if (i%2 == 0 && dp[i] > dp[i/2] + 1) {
                dp[i] = dp[i/2] + 1;
            }
            if (i%3 == 0 && dp[i] > dp[i/3] + 1) {
                dp[i] = dp[i/3] + 1;
            }
        }
        System.out.println(dp[N]);
    }
}

       Problem 9095 1, 2, 3 더하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

1은 1가지
2는 1+1 / 2 = 2가지
3은 1+1+1 / 1+2 / 2+1 / 3 = 4가지

4는 1+1+1+1 / 1+1+2 / 1+2+1 / 2+1+1 / 2+2 / 1+3 / 3+1 = 7가지
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 11;
        int[] num = new int[max];
        num[1] = 1;
        num[2] = 2;
        num[3] = 4;

        for (int i=0; i<N; i++) {
            int M = Integer.parseInt(br.readLine());
            for (int j=4; j<=M; j++) {
                num[j] = num[j-1] + num[j-2] + num[j-3];
            }
            System.out.println(num[M]);
        }
    }
}
*/
