package BaekJoon.Problem;
/*

       Problem 1100 하얀 칸
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[8][8];
        int ans = 0;
        for (int i=0; i<8; i++) {
            String s = sc.next();
            for (int j=0; j<8; j++) {
                board[i][j] = s.charAt(j);
                if ((i+j) % 2 == 0 && board[i][j] == 'F') {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

       Problem 1026 보물
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<N; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i=0; i<N; i++) {
            sum += arr1[i]*arr2[N-i-1];
        }
        System.out.println(sum);
    }
}

       Problem  1037 약수 (1)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (n-- > 0) {
            int S = Integer.parseInt(st.nextToken());
            max = S > max ? S : max;
            min = S < min ? S : min;
        }
        System.out.println(max * min);
    }
}

       Problem 1049 기타줄
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[M];
        int[] u = new int[M];
        for (int i=0; i<M; i++) {
            p[i] = sc.nextInt();
            u[i] = sc.nextInt();
        }
        Arrays.sort(p);
        Arrays.sort(u);
        int min = Integer.MAX_VALUE;
        min = Math.min(((N / 6) + 1) * p[0], N * u[0]);
        min = Math.min(min, ((N / 6)) * p[0] + (N % 6) * u[0]);
        System.out.println(min);
    }
}

       Problem 1057 토너먼트
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        while (a != b) {
            a = (a+1) / 2;
            b = (b+1) / 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}

       Problem 1065 한수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int A,B,C = 0;

        for(int i=1; i<=N; i++){
            A=i/100;
            B=(i/10)%10;
            C=i%10;
            if(i<100)
                count++;
            else {
                if((A-B) == (B-C))
                    count++;
            }
        }
        System.out.println(count);
    }
}

       Problem  1085 직사각형에서 탈출
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x = 0, y = 0, w = 0, h = 0;

        st = new StringTokenizer(br.readLine()," ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        if (x > w-x) {
            x = w-x;
        } else {
            x = x;
        }

        if (y > h-y) {
            y = h-y;
        } else {
            y = y;
        }

        int[] s = new int[2];
        s[0] = x;
        s[1] = y;

        Arrays.sort(s);
        System.out.println(s[0]);
    }
}

       Problem 1094 막대기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int bar = 64;
        int sum = 0;
        int cnt = 1;

        while (true) {
            if (X < bar + sum) {
                bar /= 2;
            } else if (X > bar + sum) {
                sum += bar;
                bar /= 2;
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}

       Problem 1110 더하기 사이클
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = N;
        int cnt = 0;

        while (true) {
            int a = M/10;
            int b = M%10;
            M = b*10 + (a+b)%10;
            cnt ++;
            if (N==M) {
                break;
            }
        }
        System.out.println(cnt);
    }
}

       Problem 1269 대칭 차집합
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            set.add(sc.nextInt());
        }
        for (int i=0; i<M; i++) {
            int L = sc.nextInt();
            if (set.contains(L)) {
                set.remove(L);
            } else {
                set.add(L);
            }
        }
        System.out.println(set.size());
    }
}

       Problem 1292 쉽게 푸는 문제
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < b; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += list.get(i-1);
        }
        System.out.println(result);
    }
}

       Problem 1436 영화감독 숌
import java.util.Scanner;

public class Main {
    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 666; ; i++) {
            if (Integer.toString(i).indexOf("666") != -1) {
                count++;
            }

            if (count == N) {
                System.out.println(i);
                return;
            }
        }
    }
}

       Problem 1475 방 번호
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] card = new int[9];
        buyCard(card);
        int cnt = 1;

        while (N != 0) {
            int temp = N % 10;

            if (temp == 9) {
                temp = 6;
            }
            if (card[temp] == 0) {
                buyCard(card);
                card[temp]--;
                cnt++;
            } else {
                card[temp]--;
            }

            N /= 10;
        }
        System.out.println(cnt);
    }
    public static void buyCard(int[] card) {
        for (int i=0; i<9; i++) {
            if (i == 6) {
                card[i] += 2;
            } else {
                card[i] += 1;
            }
        }
    }
}

       Problem 1546 평균
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        double[] num = new double[1001];
        double sum = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            num[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(num);

        for (int i=0; i<num.length; i++) {
            sum += ((num[i]/num[num.length-1])*100);
        }
        System.out.println(sum / N);
    }
}

       Problem 1550 16진수
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int dec = Integer.parseInt(hex, 16);
        System.out.println(dec);
    }
}

       Problem 1676 팩토리얼 0의 개수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N >= 5) {
            cnt += N/5;
            N/=5;
        }
        System.out.println(cnt);
    }
}

     Problem 1748 수 이어 쓰기 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int plus = 1;
        int num = 10;
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++) {
            if(i%num == 0) {
                plus ++;
                num *= 10;
            }
            count += plus;
        }
        System.out.println(count);
    }
}

       Problem 1789 수 들의 합
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;
        int m=1;
        while(sum<=N) {
            sum += m++;
        }
        System.out.println(m-2);
    }
}

       Problem  1929 소수 구하기 (Buffer)
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        boolean[] check = new boolean[end+1];

        check[0] = check[1] = true;

        for(int i = 2; i*i <= end; i++){
            if(check[i]) continue;
            for(int j = i*i; j <= end; j+=i){
                check[j] = true;
            }
        }
        for(int i = start; i <= end; i++){
            if(!check[i]) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}

       Problem 1934 최소공배수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int gcd = 0;
            for (int j=1; j<=Math.min(a, b); j++) {
                if ((a%j == 0) && (b%j == 0)) {
                    gcd = j;
                }
            }
            int lcm = a*b/gcd;
            sb.append(lcm+"\n");
        }
        System.out.println(sb);
    }
}

       Problem  1978 소수 찾기
import java.util.Scanner;


public class Main {
    public static boolean is_prime(int x) {
        if (x <= 1) {
            return false;
        } else if (x == 2) {
            return true;
        }
        for (int i=2; i*i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        while (n --> 0) {
            if (is_prime(sc.nextInt())) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}

       Problem 2217 로프
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rope = new int[N];

        for (int i=0; i<N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);

        int max = Integer.MIN_VALUE;

        for (int i=0; i<N; i++) {
            max = Math.max(max, rope[i] * (N-i));
        }
        System.out.println(max);
    }
}

       Problem  2284 알람 시계
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m-45 < 0){
            h -= 1;
            m += 15;
            if (h<0) {
                h = 23;
            }
        } else {
            m -= 45;
        }
        System.out.println(h + " " + m);
    }
}

       Problem 2455 지능형 기차 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int board = 0;
        int cnt = 0;
        for (int i=0; i<4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            if (out == 0) {
                board = in;
            } else {
                board = board - out + in;
            }
            cnt = Math.max(cnt, board);
        }
        System.out.println(cnt);
    }
}

       Problem 2490 윷놀이
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a+b+c+d == 1) {
                System.out.println("C");
            } else if (a+b+c+d == 2) {
                System.out.println("B");
            } else if (a+b+c+d == 3) {
                System.out.println("A");
            } else if (a+b+c+d == 0) {
                System.out.println("D");
            } else if (a+b+c+d == 4) {
                System.out.println("E");
            }
        }
    }
}

       Problem 2563 색종이
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[100][100];
        int cnt = 0;
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j=a; j<a+10; j++) {
                for (int k=b; k<b+10; k++) {
                    board[j][k] = 1;

                }
            }
        }
        for (int j=0; j<100; j++) {
            for (int k=0; k<100; k++) {
                if (board[j][k] == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

       Problem 2577 숫자의 개수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int mul = A*B*C;
        int[] arr = new int[10];

        while (mul != 0) {
            arr[mul%10]++;
            mul/=10;
        }

        for (int ans : arr) {
            System.out.println(ans);
        }
    }
}

     Problem 2581 소수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        boolean flag = true;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=M; i<=N; i++) {
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag && i != 1) {
                list.add(i);
                sum += i;
            }
            flag = true;
        }

        if(!list.isEmpty()) {
            System.out.println(sum);
            System.out.println(list.get(0));
        } else {
            System.out.println(-1);
        }
    }
}

       Problem  2609 GCD, LCM
import java.util.Scanner;

public class Main {
    public static int gcd(int x, int y) {
        if (y==0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a,b);
        int l = a*b/g;
        System.out.println(g);
        System.out.println(l);
    }
}

       Problem 2869 달팽이는 올라가고 싶다
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        double V = sc.nextInt();

        int answer = (int)Math.ceil((V-B) / (A-B));
        System.out.println(answer);
    }
}

       Problem 2914 저작권
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int I = sc.nextInt();
        int ans = 0;
        if (A == 1) {
            ans = A*I;
        } else {
            ans = A * (I-1) + 1;
        }
        System.out.println(ans);
    }
}

       Problem 2941 크로아티아 알파벳
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = sc.next();

        for (int i=0; i<arr.length; i++) {
            if (str.contains(arr[i])) {
                str = str.replace(arr[i], "#");
            }
        }
        System.out.println(str.length());
    }
}

       Problem  3009 네 번째 점
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int x = 0;
        int y = 0;
        int[] p = new int[6];
        st = new StringTokenizer(br.readLine()," ");
        p[0] = Integer.parseInt(st.nextToken());
        p[1] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        p[2] = Integer.parseInt(st.nextToken());
        p[3] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        p[4] = Integer.parseInt(st.nextToken());
        p[5] = Integer.parseInt(st.nextToken());

        if (p[0] == p[2]) {
            x = p[4];
        } else if (p[0] == p[4]) {
            x = p[2];
        } else {
            x = p[0];
        }

        if (p[1] == p[3]) {
            y = p[5];
        } else if (p[1] == p[5]) {
            y = p[3];
        } else {
            y = p[1];
        }
        System.out.println(x + " " + y);
    }
}
       Problem 4153 직각삼각형
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            } else if (Math.pow(arr[2], 2) == (Math.pow(arr[0],2) + Math.pow(arr[1], 2))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}

       Problem 4344 평균은 넘겠지
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());	테스트 케이스

        토큰화
        String s;
        StringTokenizer st;

        for (int i = 0; i < C; i++) {
            점수를 받아낸 다음 쪼갬
            s = br.readLine();
            st = new StringTokenizer(s);
            처음값은 학생수 : 따로 받아둠
            int N = Integer.parseInt(st.nextToken());	학생 수

            int sum = 0;
            int count = 0;
            int[] score = new int[N];
            for (int j = 0; j < N; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }

            평균 계산
            sum /= N;
            for (int j = 0; j < N; j++) {
                평균 이상의 학생수를 구한다.
                if (sum < score[j]) {
                    count++;
                }
            }

            double pro = (double)count/N*100;
            bw.write(String.format("%.3f%s\n", pro,"%"));

        }

        bw.flush();
        bw.close();
    }
}

       Problem  4375 나머지
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = 0;
            for (int i=1;; i++) {
                num = num*10+1;
                num %= n;
                if (num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

       Problem 4948 베르트랑 공준
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            boolean check[] = new boolean[2*N+1];
            check[0] = check[1] = true;
            int cnt = 0;
            for (int i=2; i<=Math.sqrt(check.length); i++) {
                for (int j=i*i; j<check.length; j+=i) {
                    check[j] = true;
                }
            }

            for (int i=N+1; i<2*N+1; i++) {
                if(!check[i]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

       Problem 5347 LCM
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=0; tc<T; tc++) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            System.out.println(N * M / gcd(N, M));
        }

    }
    static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

       Problem 7571 점 모으기
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] x = new int[M];
        int[] y = new int[M];
        for (int i=0; i<M; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int x_median = x[x.length/2];
        int y_median = y[y.length/2];
        int x_sum = 0;
        int y_sum = 0;
        for (int i=0; i<M; i++) {
            x_sum += Math.abs(x[i] - x_median);
            y_sum += Math.abs(y[i] - y_median);
        }
        System.out.println(x_sum + y_sum);
    }
}

       Problem 9613 GCD 합
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=0; tc<T; tc++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            long ans = 0;
            for (int i=0; i<N-1; i++) {
                for (int j=i+1; j<N; j++) {
                    ans += gcd(arr[i], arr[j]);
                }
            }
            System.out.println(ans);
        }
    }
    static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

       Problem 10162 전자레인지
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] btn = {300, 60, 10};
        int[] ans = new int[3];
        if (T % 10 != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        if (T >= btn[0]) {
            ans[0] += T / btn[0];
            T %= btn[0];
        } if (T >= btn[1]) {
            ans[1] += T/btn[1];
            T %= btn[1];
        } if (T >= btn[2]) {
            ans[2] += T/btn[2];
            T %= btn[2];
        }
        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }
}

       Problem 10610 30
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;

        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        int len = charArr.length;

        StringBuilder sb = new StringBuilder();
        for (int i=len-1; i>=0; i--) {
            int num = charArr[i] - '0';
            sum += num;
            sb.append(num);
        }
        if (charArr[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb.toString());
    }
}

       Problem 10709 기상캐스터
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] board = new int[H][W];
        for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                board[i][j] = -1;
            }
        }
        for (int i=0; i<H; i++) {
            String s = sc.next();
            char[] str = s.toCharArray();
            for (int j=0; j<W; j++) {
                if (str[j] == 'c') {
                    int cnt = 0;
                    for (int k=j; k<W; k++) {
                        board[i][k] = cnt;
                        cnt++;
                    }
                }
            }
        }
        for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

       Problem 10797 10부제
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[] car = new int[5];
        int cnt = 0;
        for (int i=0 ;i<5; i++) {
            car[i] = sc.nextInt();
            if (car[i] == d) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

       Problem  10818 최소, 최대
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);

    }
}

       Problem 11653 소인수분해
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int d = 2;

        while (N != 1) {
            if (N%d == 0) {
                N /= d;
                System.out.println(d);
            } else {
                d++;
            }
        }
    }
}

       Problem 13909 창문 닫기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int i=1; i<=Math.sqrt(N); i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}

       Problem 14681 사분면 고르기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}

       Problem 14916 거스름돈
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                cnt = N / 5 + cnt;
                break;
            }
            N -= 2;
            cnt++;
        }
        if (N < 0) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}

       Problem 15965 K번째 소수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 10000000;
        int[] prime = new int[max];
        boolean[] check = new boolean[max];
        check[0] = check[1] = true;
        int cnt = 0;
        for (int i=2; i<max; i++) {
            if (!check[i]) {
                prime[cnt++] = i;
                for (int j=i+i; j<max; j+=i) {
                    check[j] = true;
                }
            }
        }
        System.out.println(prime[N-1]);
    }
}

       Problem  17427 약수 (2)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        for (int i=1; i<=n; i++) {
            ans += (n/i)*i;
        }
        System.out.println(ans);
    }
}
*/
