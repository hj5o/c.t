/*
package Programmers.LEVEL_1;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = Long.toString(n).split("");
        String str = "";
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i=0; i<arr.length; i++) {
            str += arr[i];
        }
        answer = Long.parseLong(str);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(118372));
    }
}*/
