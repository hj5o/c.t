package SWEA.LEVEL_D.etc.READY_FOR_SSAFY;

import java.util.*;

public class BOJ_13300 { // 방 배정
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] room = new int[7][2];
        for (int i=0; i<7; i++) {
            for (int j=0; j<2; j++) {
                room[i][j] = 0;
            }
        }
        for (int i=0; i<N; i++) {
            int S = sc.nextInt();
            int Y = sc.nextInt();
            if (S == 0) {
                room[Y][0]++;
            } else {
                room[Y][1]++;
            }
        }
        int answer = 0;
        for (int i=0; i<7; i++) {
            for (int j=0; j<2; j++) {
                answer += room[i][j] / K;
                if (room[i][j] % K != 0) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}