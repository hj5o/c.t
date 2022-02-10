package BaekJoon.BASIC;

////      7586 덩치
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main{
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int N = Integer.parseInt(br.readLine());
//        int[] kg = new int[N];
//        int[] cm = new int[N];
//        int[] rank = new int[N];
//        int cnt = 0;
//
//
//        for (int i=0; i<N; i++) {
//            st = new StringTokenizer(br.readLine());
//            kg[i]=Integer.parseInt(st.nextToken());
//            cm[i]=Integer.parseInt(st.nextToken());
//        }
//
//        for (int i=0; i<N; i++) {
//            cnt = 1;
//
//            for (int j=0; j<N; j++) {
//                if (kg[i] < kg[j] && cm[i] < cm[j])
//                    cnt ++;
//
//                rank[i] = cnt;
//            }
//        }
//        for (int i=0; i<rank.length; i++) {
//            System.out.print(rank[i] + " ");
//        }
//    }
//}

////      2231 분해합
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int r = 0;
//
//        for (int i=1; i<n; i++) {
//            int num = i;
//            int sum = 0;
//
//            while (true) {
//                sum += (num%10);
//                num /= 10;
//
//                if (num == 0) {
//                    break;
//                }
//            }
//            if (n == (sum + i)) {
//                r = i;
//                break;
//            }
//        }
//        System.out.println(r);
//
//    }
//}

////      2798 블랙잭
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
//        st = new StringTokenizer(br.readLine()," ");
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(br.readLine()," ");
//        int arr[] = new int[N];
//        for (int i=0; i<N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int max = 0;
//        int sum = 0;
//        for (int i=0; i<N-2; i++) {
//            for (int j=i+1; j<N-1; j++) {
//                for (int k=j+1; k<N; k++) {
//                    sum = arr[i] + arr[j] + arr[k];
//                    if (sum <= M && max < sum) {
//                        max = sum;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(max);
//    }
//}

////      2309 일곱 난쟁이
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] n = new int[9];
//        int sum = 0;
//
//        for (int i=0; i<9; i++) {
//            n[i] = Integer.parseInt(br.readLine());
//            sum += n[i];
//        }
//        sum -= 100;
//        Arrays.sort(n);
//
//        int c1 = 0, c2 = 0;
//
//        for (int i=0; i<9; i++) {
//            int t_sum = sum - n[i];
//            for (int j=i+1; j<9; j++) {
//                if (t_sum == n[j] && i!=j) {
//                    c1 = i;
//                    c2 = j;
//                    break;
//                }
//            }
//        }
//        for (int i=0; i<9; i++) {
//            if(i!=c1 && i!=c2) {
//                System.out.println(n[i]);
//            }
//        }
//    }
//}
