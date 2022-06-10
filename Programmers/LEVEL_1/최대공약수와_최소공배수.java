/*
package Programmers.LEVEL_1;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        answer[0] = a;
        answer[1] = n * m / a;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(2, 5)));
    }
}
*/
