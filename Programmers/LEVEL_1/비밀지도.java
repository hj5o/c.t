/*
package Programmers.LEVEL_1;

import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            if (answer[i].length() < n) {
                answer[i] = "0" + answer[i];
            }
        }
        for (int i=0; i<n; i++) {
            answer[i] = answer[i].replace("1", "#").replace("0", " ");

        }
        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(s.solution(n, arr1, arr2)));
    }
}
*/
