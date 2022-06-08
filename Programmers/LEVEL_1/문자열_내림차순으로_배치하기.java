/*
package Programmers.LEVEL_1;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for (int i=0; i<str.length; i++) {
            answer += str[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Zbcdefg"));
    }
}
*/
