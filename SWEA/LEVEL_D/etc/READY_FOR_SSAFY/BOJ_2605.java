package SWEA.LEVEL_D.etc.READY_FOR_SSAFY;

import java.util.*;

public class BOJ_2605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<=N; i++) {
            list.add(sc.nextInt(), i);
        }
        for (int i=N-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
