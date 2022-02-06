package BaekJoon.BASIC;

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
