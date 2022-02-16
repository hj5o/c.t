package BaekJoon.BASIC;

////     Problem 11047 동전 0
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int[] coin = new int[N];
//
//        for (int i=N-1; i>=0; i--) {
//            coin[i] = Integer.parseInt(br.readLine());
//        }
//
//        int ans = 0;
//        for (int i=0; i<N; i++) {
//            if ( M/coin[i] > 0 ) {
//                ans += M/coin[i];
//                M %= coin[i];
//            }
//        }
//        System.out.println(ans);
//    }
//}
