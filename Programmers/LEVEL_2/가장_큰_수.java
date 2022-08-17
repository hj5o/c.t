/*
package Programmers.LEVEL_2;

import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));
        for (int i=0; i<str.length; i++) {
            answer += str[i];
        }
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {0,0,0,0};
        System.out.println(s.solution(numbers));
    }
}
*/
