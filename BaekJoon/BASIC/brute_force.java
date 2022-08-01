package BaekJoon.BASIC;
/*

       Problem 1107 리모컨
import java.util.Scanner;

public class Main {
    static boolean[] broken = new boolean[10];
    static int solve(int i) {
        if (i == 0) {
            if (broken[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        int len = 0;
        while (i > 0) {
            if (broken[i % 10]) {
                return 0;
            }
            len += 1;
            i /= 10;
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int ans = Math.abs(N-100);

        for (int i=0; i<M; i++) {
            broken[sc.nextInt()] = true;
        }
        for (int i=0; i<999999; i++) {
            int j = i;
            int len = solve(j);
            if (len > 0) {
                int cnt = Math.abs(j - N);
                if (ans > len + cnt) {
                    ans = len + cnt;
                }
            }
        }
        System.out.println(ans);
    }
}

       Problem  1476 날짜 계산
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int i = 1, j = 1, k=1, y=1;
        while (true) {
            if ( i == E && j == S && k == M) {
                break;
            }
            i++;
            j++;
            k++;
            y++;

            if (i > 15) {
                i = 1;
            }
            if (j > 28) {
                j = 1;
            }
            if (k > 19) {
                k = 1;
            }
        }

        System.out.println(y);
    }
}

     Problem  2231 분해합
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = 0;

        for (int i=1; i<n; i++) {
            int num = i;
            int sum = 0;

            while (true) {
                sum += (num%10);
                num /= 10;

                if (num == 0) {
                    break;
                }
            }
            if (n == (sum + i)) {
                r = i;
                break;
            }
        }
        System.out.println(r);

    }
}

     Problem  2309 일곱 난쟁이
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[9];
        int sum = 0;

        for (int i=0; i<9; i++) {
            n[i] = Integer.parseInt(br.readLine());
            sum += n[i];
        }
        sum -= 100;
        Arrays.sort(n);

        int c1 = 0, c2 = 0;

        for (int i=0; i<9; i++) {
            int t_sum = sum - n[i];
            for (int j=i+1; j<9; j++) {
                if (t_sum == n[j] && i!=j) {
                    c1 = i;
                    c2 = j;
                    break;
                }
            }
        }
        for (int i=0; i<9; i++) {
            if(i!=c1 && i!=c2) {
                System.out.println(n[i]);
            }
        }
    }
}

     Problem  2798 블랙잭
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int arr[] = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int sum = 0;
        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum <= M && max < sum) {
                        max = sum;
                        break;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

       Problem 3085 사탕 게임
import java.util.Scanner;

public class Main {
    static int N;
    static char[][] board;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new char[N][N];
        for (int i=0; i<N; i++) {
            String s = sc.next();
            for (int j=0; j<N; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<N-1; j++) {
                char temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;
                check(board);
                temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<N-1; j++) {
                char temp = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = temp;
                check(board);
                temp = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = temp;
            }
        }
        System.out.println(max);
    }
    private static void check(char[][] map) {
        for (int i=0; i<N; i++) {
            int cnt = 1;
            for (int j=0; j<N-1; j++) {
                if (map[i][j] == map[i][j+1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }
        for (int i=0; i<N; i++) {
            int cnt = 1;
            for (int j=0; j<N-1; j++) {
                if (map[j][i] == map[j+1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }
    }
}

     Problem  7586 덩치
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] kg = new int[N];
        int[] cm = new int[N];
        int[] rank = new int[N];
        int cnt = 0;


        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            kg[i]=Integer.parseInt(st.nextToken());
            cm[i]=Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<N; i++) {
            cnt = 1;

            for (int j=0; j<N; j++) {
                if (kg[i] < kg[j] && cm[i] < cm[j])
                    cnt ++;

                rank[i] = cnt;
            }
        }
        for (int i=0; i<rank.length; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}
*/
