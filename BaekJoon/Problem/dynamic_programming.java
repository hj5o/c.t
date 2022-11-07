package BaekJoon.Problem;

/*
       Problem 1003 피보나치 함수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        for (int i=0; i<N; i++) {
            dp[i] = Integer.parseInt(br.readLine());
        }
        int[] f0 = new int[41];
        int[] f1 = new int[41];

        f0[0] = 1;
        f0[1] = 0;
        f1[0] = 0;
        f1[1] = 1;

        for (int i=2; i<41; i++) {
            f0[i] = f0[i-1] + f0[i-2];
            f1[i] = f1[i-1] + f1[i-2];
        }
        for (int i=0; i<N; i++) {
            System.out.printf("%d %d\n", f0[dp[i]], f1[dp[i]]);
        }
    }
}

       Problem 1010 다리 놓기
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=0; tc<T; tc++) {
            double N = sc.nextInt();
            double M = sc.nextInt();
            double ans = 0;
            double num = 1;
            for (double i=M; i>M-N; i--) {
                num *= i;
            }
            double num2 = 1;
            for(double j=N; j>0; j--) {
                num2 *= j;
            }
            ans = num/num2;
            System.out.printf("%.0f\n", ans);
        }
    }
}


       Problem 1149 RGB 거리
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] cost = new int[N][3];

        for (int i=0; i<N; i++) {
            for (int j=0; j<3; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        for (int i=1; i<N; i++) {
            cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]);
            cost[i][1] += Math.min(cost[i-1][0], cost[i-1][2]);
            cost[i][2] += Math.min(cost[i-1][0], cost[i-1][1]);
        }
        System.out.println(Math.min(Math.min(cost[N-1][0], cost[N-1][1]), cost[N-1][2]));
    }
}

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

       Problem 1535 안녕
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] hp = new int[N+1];
        int[] emo = new int[N+1];
        int[] dp = new int[100];
        for (int i=0; i<N; i++) {
            hp[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            emo[i] = sc.nextInt();
        }

        for (int i=0; i<N; i++) {
            for (int j=99; j>=hp[i]; j--) {
                dp[j] = Math.max(dp[j], emo[i] + dp[j - hp[i]]);
            }
        }
        System.out.println(dp[99]);
    }
}

       Problem 1699 제곱수의 합
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];

        for (int i=1; i<=N; i++) {
            dp[i] = i;
            for (int j=1; j*j <=i; j++) {
                if (dp[i] > dp[i-j*j]+1) {
                    dp[i] = dp[i-j*j]+1;
                }
            }
        }
        System.out.println(dp[N]);
    }
}

       Problem 1912 연속합
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0] = arr[0];
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}

       Problem 1932 정수 삼각형
단순히 위에서 아래로 내려오는 최대 경로가 아님
이진트리로 부모 노드를 거치지 않으면 같은 차수에 높은 숫자가 있어도 채택할 수 없음
Bottom up 방식이 아닌 Top down 방식인 재귀로 해결

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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

       Problem 1965 상자넣기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int[] dp = new int[N+1];
        for (int i=0; i<=N; i++) {
            for (int j=0; j<=i; j++) {
                if (arr[j] < arr[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            cnt = Math.max(cnt, dp[i]);
        }
        System.out.println(cnt+1);
    }
}

       Problem 2156 포도주 시식
계단 오르기 문제와 비슷하다.
다만 계단 오르기는 마지막 계단을 반드시 밟아야했는데, 포도주 시식문제는 그런 조건 없다.
따라서 이전 dp와 비교하여 최댓값을 갱신해야한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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

       Problem 2225 합분해
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] dp = new int[K+1][N+1];
        for (int i=1; i<=K; i++) {
            dp[i][0] = 1;
        }
        for (int i=1; i<=K; i++) {
            for (int j=1; j<=N; j++) {
                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1000000000;
            }
        }
        System.out.println(dp[K][N]);
    }
}

       Problem 2293 동전 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] v = new int[N];
        int[] dp = new int[K+1];

        for (int i=0; i<N; i++) {
            v[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 1;
        for(int i=0; i<N; i++) {
            for(int j=v[i]; j<=K; j++) {
                dp[j] += dp[j - v[i]];
            }
        }
        System.out.println(dp[K]);
    }
}

       Problem 2579 계단 오르기
N번째 계단을 밟는 경우? (연속된 계단 3개를 밟을 수 없음)
1. N-2를 밟고 N을 밟는다.
2. N-3과 N-1을 밟고 N을 밟는다.
*마지막 계단을 반드시 밟는다.

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
       Problem 2748 피보나치 수 2
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

       Problem 9084 동전
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        for (int tc = 1; tc <= TC; tc++) {
            int N = sc.nextInt();
            int[] coin = new int[N];
            for (int i = 0; i < N; i++) {
                coin[i] = sc.nextInt();
            }
            int M = sc.nextInt();
            int[] dp = new int[M + 1];
            dp[0] = 1;
            for (int i = 0; i < N; i++) {
                for (int j = coin[i]; j <= M; j++) {
                    dp[j] += dp[j - coin[i]];
                }
            }
            System.out.println(dp[M]);
        }
    }
}

       Problem 9095 1, 2, 3 더하기
1은 1가지
2는 1+1 / 2 = 2가지
3은 1+1+1 / 1+2 / 2+1 / 3 = 4가지

4는 1+1+1+1 / 1+1+2 / 1+2+1 / 2+1+1 / 2+2 / 1+3 / 3+1 = 7가지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

       Problem 9625 BABBA
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[47];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2; i<47; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[N-1] + " " + dp[N]);
    }
}

       Problem 9655~9661 돌 게임 1~7
돌을 1, 3, 4개 가져갈 수 있다.
마지막 돌을 가져가는 사람이 이긴다.
0 = SK
1 = SK
2 = CY
3 = SK
4 = SK
5 = CY
6 = SK

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());

        if (N%5 == 0 || N%5 == 2) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}

       Problem 10211 Maximum Subarray
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=0; tc<T; tc++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] dp = new int[N];
            for (int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            dp[0] = arr[0];
            for (int i=1; i<N; i++) {
                if (dp[i-1] < 0) {
                    dp[i-1] = 0;
                }
                dp[i] = dp[i-1] + arr[i];
                max = Math.max(max, dp[i]);
            }
            System.out.println(max);
        }
    }
}

       Problem 11048 이동하기
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] board = new int[N+1][M+1];
        int[][] dp = new int[N+1][M+1];
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=M; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=M; j++) {
                dp[i][j] = Math.max(board[i][j] + dp[i-1][j], board[i][j] + dp[i][j-1]);
            }
        }
        System.out.println(dp[N][M]);
    }
}

       Problem 11060 점프 점프
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            dp[i] = -1;
        }
        dp[0] = 0;
        for (int i=1; i<N; i++) {
            for (int j=0; j<i; j++) {
                if (dp[j] != -1 && i-j <= arr[j]) {
                    if (dp[i] == -1 || dp[i] > dp[j] + 1 ) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
        }
        System.out.println(dp[N-1]);
    }
}

       Problem 14494 다이나믹이 뭐예요?
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int div = 1000000007;
        long[][] dp = new long[1001][1001];
        dp[0][0] = 1;
        dp[1][1] = 1;
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=M; j++) {
                dp[i][j] = (dp[i-1][j] % div + dp[i][j-1] % div + dp[i-1][j-1] % div) % div;
            }
        }
        System.out.println(dp[N][M] % div);
    }
}

       Problem 11726 2xn 타일링
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
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[N]);
    }
}
1을 채울 때
1
2를 채울 때
3
3을 채울 때
5
4를 채울 때
9
dp[i] = dp[i-1] + 2*dp[i-2]

       Problem 11726 2xn 타일링 2
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
        dp[2] = 3;
        for (int i=3; i<=N; i++) {
            dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
        }
        System.out.println(dp[N]);
    }
}

       Problem 12865 평범한 배낭
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] W = new int[N+1];
        int[] V = new int[N+1];
        int[][] dp = new int[N+1][K+1];
        W[0] = 0;
        V[0] = 0;
        dp[0][0] = 0;
        for (int i=1; i<=N; i++) {
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=K; j++) {
                if (W[i] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - W[i]] + V[i]);
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}

       Problem 14501 퇴사
N+1일에 퇴사하기 때문에
t[i] + i는 N일 이하여야 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] t = new int[N];
        int[] p = new int[N];


        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N+1];

        for (int i=0; i<N; i++) {
            if (i + t[i] <= N){
                dp[i + t[i]] = Math.max(dp[i + t[i]], dp[i] + p[i]);
            }
            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }
        System.out.println(dp[N]);
    }
}

       Problem 15988 1,2,3 더하기 3
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long dp[] = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<=1000000; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
        }

        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int N = sc.nextInt();
            System.out.println(dp[N]);
        }
    }
}
*/

