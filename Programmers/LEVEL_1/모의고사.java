/*
package Programmers.LEVEL_1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] c1 = {1, 2, 3, 4, 5};
        int[] c2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] sol = new int[3];
        for (int i=0; i<answers.length; i++) {
            if (c1[i % c1.length] == answers[i]) {
                sol[0]++;
            }
            if (c2[i % c2.length] == answers[i]) {
                sol[1]++;
            }
            if (c3[i % c3.length] == answers[i]) {
                sol[2]++;
            }
        }
        int winnerScore = Math.max(sol[0], Math.max(sol[1], sol[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if (winnerScore == sol[0]) {
            list.add(1);
        }
        if (winnerScore == sol[1]) {
            list.add(2);
        }
        if (winnerScore == sol[2]) {
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(s.solution(answer)));
    }
}
*/
