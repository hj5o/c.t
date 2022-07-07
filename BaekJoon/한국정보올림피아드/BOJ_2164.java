package BaekJoon.한국정보올림피아드;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2164 { // 2164 카드게임
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> col = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String color = sc.next();
            int number = sc.nextInt();
            col.add(color);
            num.add(number);
        }
        Collections.sort(col);
        Collections.sort(num);
        int same_col = 0;
        int same_num = 0;
        int asc_num = 0;
        // 9 ok
        int answer = 100 + num.get(4);
        for (int i = 0; i < 4; i++) {
            if (col.get(i).equals(col.get(i + 1))) {
                same_col++;
            }
            if (num.get(i).equals(num.get(i + 1))) {
                same_num++;
            }
        }
        for (int i=0; i<4; i++) {
            if (num.get(i+1) - num.get(i) - 1 == 0) {
                asc_num++;
            }
        }
        // 1 ok
        if (same_col == 4 && asc_num == 4) {
            answer = 900 + num.get(4);

            // 4 ok
        } else if (same_col == 4) {
            answer = 600 + num.get(4);

            // 5 ok
        } else if (asc_num == 4) {
            answer = 500 + num.get(4);
        }

        // 2 ok
        if (same_num == 3 && num.get(1) == num.get(3)) {
            answer = 800 + num.get(3);

            // 3 ok
        } else if (same_num == 3) {
            if (num.get(2).equals(num.get(4))) {
                answer = 700 + num.get(4)*10 + num.get(0);
            } else {
                answer = 700 + num.get(0)*10 + num.get(4);
            }
        }

        // 6 ok
        if (same_num == 2 && num.get(0).equals(num.get(1)) && num.get(1).equals(num.get(2))) {
            answer = 400 + num.get(0);
        } else if (same_num == 2 && num.get(1).equals(num.get(2)) && num.get(2).equals(num.get(3))) {
            answer = 400 + num.get(2);
        } else if (same_num == 2 && num.get(2).equals(num.get(3)) && num.get(3).equals(num.get(4))) {
            answer = 400 + num.get(4);
        }
        // 7 ok
        if (same_num == 2 && num.get(0).equals(num.get(1)) && num.get(2).equals(num.get(3))) {
            answer = 300 + num.get(3)*10 + num.get(1);
        } else if (same_num == 2 && num.get(0).equals(num.get(1)) && num.get(3).equals(num.get(4))) {
            answer = 300 + num.get(3)*10 + num.get(1);
        } else if (same_num == 2 && num.get(1).equals(num.get(2)) && num.get(3).equals(num.get(4))) {
            answer = 300 + num.get(3)*10 + num.get(1);
        }

        // 8
        if (same_num == 1 && num.get(0).equals(num.get(1))) {
            answer = 200 + num.get(0);
        } else if (same_num == 1 && num.get(1).equals(num.get(2))) {
            answer = 200 + num.get(1);
        } else if (same_num == 1 && num.get(2).equals(num.get(3))) {
            answer = 200 + num.get(2);
        } else if (same_num == 1 && num.get(3).equals(num.get(4))) {
            answer = 200 + num.get(3);
        }
        System.out.println(answer);
    }
}

