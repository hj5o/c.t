package BaekJoon.BASIC;

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
