package BaekJoon.BASIC;

////      1929 소수 구하기
//import java.util.*;
//
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        boolean[] check = new boolean[m+1];
//        check[0] = check[1] = true;
//        for (int i=2; i*i <= m; i++) {
//            if (check[i] == true) {
//                continue;
//            }
//            for (int j=i+i; j<=m; j+=i) {
//                check[j] = true;
//            }
//        }
//        for (int i=n; i<=m; i++) {
//            if (check[i] == false) {
//                System.out.println(i);
//            }
//        }
//    }
//}

////      1978 소수 찾기
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

////        2609 GCD, LCM
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

////        17427 약수 (2)
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

////        1037 약수 (1)
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
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

////        4375 나머지
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