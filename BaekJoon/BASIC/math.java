package BaekJoon.BASIC;


////     Problem  1037 약수 (1)
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class math {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        while (n-- > 0) {
//            int S = Integer.parseInt(st.nextToken());
//            max = S > max ? S : max;
//            min = S < min ? S : min;
//        }
//        System.out.println(max * min);
//    }
//}

////     Problem 1065 한수
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int count = 0;
//        int A,B,C = 0;
//
//        for(int i=1; i<=N; i++){
//            A=i/100;
//            B=(i/10)%10;
//            C=i%10;
//            if(i<100)
//                count++;
//            else {
//                if((A-B) == (B-C))
//                    count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

////     Problem  1085 직사각형에서 탈출
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int x = 0, y = 0, w = 0, h = 0;
//
//        st = new StringTokenizer(br.readLine()," ");
//        x = Integer.parseInt(st.nextToken());
//        y = Integer.parseInt(st.nextToken());
//        w = Integer.parseInt(st.nextToken());
//        h = Integer.parseInt(st.nextToken());
//
//        if (x > w-x) {
//            x = w-x;
//        } else {
//            x = x;
//        }
//
//        if (y > h-y) {
//            y = h-y;
//        } else {
//            y = y;
//        }
//
//        int[] s = new int[2];
//        s[0] = x;
//        s[1] = y;
//
//        Arrays.sort(s);
//        System.out.println(s[0]);
//    }
//}

////     Problem  1929 소수 구하기 (Buffer)
//import java.io.*;
//import java.util.StringTokenizer;
//
//
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        int start = Integer.parseInt(st.nextToken());
//        int end = Integer.parseInt(st.nextToken());
//
//        boolean[] check = new boolean[end+1];
//
//        check[0] = check[1] = true;
//
//        for(int i = 2; i*i <= end; i++){
//            if(check[i]) continue;
//            for(int j = i*i; j <= end; j+=i){
//                check[j] = true;
//            }
//        }
//        for(int i = start; i <= end; i++){
//            if(!check[i]) bw.write(i + "\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}

////     Problem  1978 소수 찾기
//import java.util.Scanner;
//
//
//public class Main {
//    public static boolean is_prime(int x) {
//        if (x <= 1) {
//            return false;
//        } else if (x == 2) {
//            return true;
//        }
//        for (int i=2; i*i <= x; i++) {
//            if (x % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 0;
//
//        while (n --> 0) {
//            if (is_prime(sc.nextInt())) {
//                ans += 1;
//            }
//        }
//        System.out.println(ans);
//    }
//}

////     Problem  2284 알람 시계
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int h = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        if (m-45 < 0){
//            h -= 1;
//            m += 15;
//            if (h<0) {
//                h = 23;
//            }
//        } else {
//            m -= 45;
//        }
//        System.out.println(h + " " + m);
//    }
//}

////     Problem  2609 GCD, LCM
//import java.util.Scanner;
//
//public class Main {
//    public static int gcd(int x, int y) {
//        if (y==0) {
//            return x;
//        } else {
//            return gcd(y, x%y);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int g = gcd(a,b);
//        int l = a*b/g;
//        System.out.println(g);
//        System.out.println(l);
//    }
//}

////     Problem  3009 네 번째 점
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int x = 0;
//        int y = 0;
//        int[] p = new int[6];
//        st = new StringTokenizer(br.readLine()," ");
//        p[0] = Integer.parseInt(st.nextToken());
//        p[1] = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(br.readLine()," ");
//        p[2] = Integer.parseInt(st.nextToken());
//        p[3] = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(br.readLine()," ");
//        p[4] = Integer.parseInt(st.nextToken());
//        p[5] = Integer.parseInt(st.nextToken());
//
//        if (p[0] == p[2]) {
//            x = p[4];
//        } else if (p[0] == p[4]) {
//            x = p[2];
//        } else {
//            x = p[0];
//        }
//
//        if (p[1] == p[3]) {
//            y = p[5];
//        } else if (p[1] == p[5]) {
//            y = p[3];
//        } else {
//            y = p[1];
//        }
//        System.out.println(x + " " + y);
//    }
//}

//     Problem 4344 평균은 넘겠지
//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int C = Integer.parseInt(br.readLine());	//테스트 케이스
//
//        //토큰화
//        String s;
//        StringTokenizer st;
//
//        for (int i = 0; i < C; i++) {
//            //점수를 받아낸 다음 쪼갬
//            s = br.readLine();
//            st = new StringTokenizer(s);
//            //처음값은 학생수 : 따로 받아둠
//            int N = Integer.parseInt(st.nextToken());	//학생 수
//
//            int sum = 0;
//            int count = 0;
//            int[] score = new int[N];
//            for (int j = 0; j < N; j++) {
//                score[j] = Integer.parseInt(st.nextToken());
//                sum += score[j];
//            }
//
//            //평균 계산
//            sum /= N;
//            for (int j = 0; j < N; j++) {
//                //평균 이상의 학생수를 구한다.
//                if (sum < score[j]) {
//                    count++;
//                }
//            }
//
//            double pro = (double)count/N*100;
//            bw.write(String.format("%.3f%s\n", pro,"%"));
//
//        }
//
//        bw.flush();
//        bw.close();
//    }
//}

////     Problem  4375 나머지
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int n = sc.nextInt();
//            int num = 0;
//            for (int i=1;; i++) {
//                num = num*10+1;
//                num %= n;
//                if (num == 0) {
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
//    }
//}

////     Problem  10818 최소, 최대
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int N = Integer.parseInt(br.readLine());
//        int [] arr = new int[N];
//
//        st = new StringTokenizer(br.readLine());
//
//        for (int i=0; i<N; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            arr[i] = num;
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[0] + " " + arr[N-1]);
//
//    }
//}

////     Problem 11653 소인수분해
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int d = 2;
//
//        while (N != 1) {
//            if (N%d == 0) {
//                N /= d;
//                System.out.println(d);
//            } else {
//                d++;
//            }
//        }
//    }
//}

////     Problem  17427 약수 (2)
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        long ans = 0;
//        for (int i=1; i<=n; i++) {
//            ans += (n/i)*i;
//        }
//        System.out.println(ans);
//    }
//}