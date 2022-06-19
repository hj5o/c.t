/*
package Programmers.LEVEL_2;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] nums = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nums);
        answer += String.valueOf(nums[0]);
        answer += " ";
        answer += String.valueOf(nums[nums.length-1]);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1 2 3 4"));
    }
}
*/
