package SWEA.LEVEL_D.etc.READY_FOR_SSAFY;

import java.util.*;

public class BOJ_2628 { // 종이자르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int c = sc.nextInt();
        int max_r = 0;
        int max_c = 0;
        ArrayList<Integer> r_cut = new ArrayList<>();
        ArrayList<Integer> c_cut = new ArrayList<>();
        r_cut.add(0);
        r_cut.add(M);
        c_cut.add(0);
        c_cut.add(N);
        for (int i=0; i<c; i++) {
            int level = sc.nextInt();
            int cut = sc.nextInt();
            if (level == 0) {
                r_cut.add(cut);
            } else {
                c_cut.add(cut);
            }
        }
        Collections.sort(r_cut);
        Collections.sort(c_cut);
        for (int i=0; i<r_cut.size()-1; i++) {
            int dist = r_cut.get(i+1) - r_cut.get(i);
            max_r = Math.max(max_r, dist);
        }
        for (int i=0; i<c_cut.size()-1; i++) {
            int dist = c_cut.get(i+1) - c_cut.get(i);
            max_c = Math.max(max_c, dist);
        }
        System.out.println(max_r * max_c);
    }
}