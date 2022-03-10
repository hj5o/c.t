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

       Problem 2579 계단 오르기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

N번째 계단을 밟는 경우? (연속된 계단 3개를 밟을 수 없음)
2. N-2를 밟고 N을 밟는다.
1. N-3과 N-1을 밟고 N을 밟는다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 300;
        int[] dp = new int [max+1];
        int[] arr = new int [max+1];

        for (int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        dp[3] = Math.max(arr[1],arr[2])+arr[3];

        for (int i=4; i<=N; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];
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

       Problem 11726 2xn 타일링
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

1은 1가지
2는 2가지
3은 3가지
4는 5가지
dp[i] = dp[i-1] + dp[i-2]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 1000;
        int[] dp = new int[max+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3; i<=N; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        System.out.println(dp[N]);
    }
}
*/
