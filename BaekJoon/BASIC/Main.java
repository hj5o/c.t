package BaekJoon.BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i=0; i<N; i++) {
            str[i] = br.readLine();
        }
        String[] clone = str.clone();
        Arrays.sort(str);
        if (clone[clone.length-1] == str[0]) {
            System.out.println("DECREASING");
        }
        else if (clone[0] == str[0]) {
            System.out.println("INCREASING");
        }
        else {
            System.out.println("NEITHER");
        }
    }
}