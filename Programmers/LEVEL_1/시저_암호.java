/*
package Programmers.LEVEL_1;

class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for (int i=0; i<n; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (arr[j] == ' ') {
                    continue;
                } else if (arr[j] == 'z' || arr[j] == 'Z') {
                    arr[j] -= 26;
                }
                arr[j] += 1;

            }
        }
        return String.valueOf(arr);
    }
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution("AB", 1));
    }
}*/
