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

       Problem 1932 정수 삼각형
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

단순히 위에서 아래로 내려오는 최대 경로가 아님
이진트리로 부모 노드를 거치지 않으면 같은 차수에 높은 숫자가 있어도 채택할 수 없음
Bottom up 방식이 아닌 Top down 방식인 재귀로 해결

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[N][];

        for (int i=0; i<N; i++) {
            arr[i] = new int[i+1];

            st = new StringTokenizer(br.readLine()," ");
            for (int j=0; j<=i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=N-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                arr[i-1][j] += Math.max(arr[i][j], arr[i][j+1]);
            }
        }
        System.out.println(arr[0][0]);
    }
}

       Problem 2156 포도주 시식
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

계단 오르기 문제와 비슷하다.
다만 계단 오르기는 마지막 계단을 반드시 밟아야했는데, 포도주 시식문제는 그런 조건 없다.
따라서 이전 dp와 비교하여 최댓값을 갱신해야한다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if (N >= 1) {
            dp[0] = arr[0];
        }
        if (N >= 2) {
            dp[1] = arr[0] + arr[1];
        }
        if (N >= 3) {
            dp[2] = Math.max(dp[1], Math.max(dp[0] + arr[2], arr[1] + arr[2]));
        }
        for (int i=3; i<N; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
        }
        System.out.println(dp[N-1]);
    }
}

       Problem 2579 계단 오르기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

N번째 계단을 밟는 경우? (연속된 계단 3개를 밟을 수 없음)
  1. N-2를 밟고 N을 밟는다.
  2. N-3과 N-1을 밟고 N을 밟는다.
*마지막 계단을 반드시 밟는다.

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
       Problem 2748
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2; i<=N; i++) {
            dp[i] = dp[i-1] + dp[i-2];
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

