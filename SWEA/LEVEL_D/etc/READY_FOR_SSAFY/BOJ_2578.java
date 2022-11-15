package SWEA.LEVEL_D.etc.READY_FOR_SSAFY;

import java.util.*;

public class BOJ_2578 { // 빙고
    static int[][] board;
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[5][5];
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for (int i=1; i<=25; i++) {
            int block = sc.nextInt();
            for (int j=0; j<5; j++) {
                for (int k=0; k<5; k++) {
                    if (board[j][k] == block) {
                        board[j][k] = 0;
                    }
                }
            }
            r_check();
            c_check();
            r_diag();
            c_diag();
            if (cnt >= 3) {
                System.out.println(i);
                break;
            }
            cnt = 0;
        }
    }
    static void r_check() {
        for (int i=0; i<5; i++) {
            int zero = 0;
            for (int j=0; j<5; j++) {
                if (board[i][j] == 0) {
                    zero++;
                }
            }
            if (zero == 5) {
                cnt++;
            }
        }
    }
    static void c_check() {
        for (int i=0; i<5; i++) {
            int zero = 0;
            for (int j=0; j<5; j++) {
                if (board[j][i] == 0) {
                    zero++;
                }
            }
            if (zero == 5) {
                cnt++;
            }
        }
    }
    static void r_diag() {
        int zero = 0;
        for (int i=0; i<5; i++) {
            if (board[i][i] == 0) {
                zero++;
            }
        }
        if (zero == 5) {
            cnt++;
        }
    }
    static void c_diag() {
        int zero = 0;
        for (int i=0; i<5; i++) {
            if (board[i][4-i] == 0) {
                zero++;
            }
        }
        if (zero == 5) {
            cnt++;
        }
    }
}
