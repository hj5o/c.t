package BaekJoon.BASIC;

////     Problem 1427
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char[] arr = br.readLine().toCharArray();
//
//        Arrays.sort(arr);
//
//        for(int i = arr.length-1; i>=0; i--){
//            System.out.print(arr[i]);
//        }
//    }
//}

////     Problem 2751 수 정렬하기 2
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i=0; i<N; i++) {
//            list.add(Integer.parseInt(br.readLine()));
//        }
//        Collections.sort(list);
//
//        for (int num : list) {
//            sb.append(num).append("\n");
//        }
//        System.out.println(sb);
//    }
//}