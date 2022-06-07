/*
package Programmers.LEVEL_1;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        if (arr.length % 2 == 0) {
            for (int i=arr.length/2-1; i<=arr.length/2; i++) {
                answer += arr[i];
            }
        }
        if (arr.length % 2 != 0) {
            for (int i=arr.length/2; i<=arr.length/2; i++) {
                answer += arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("qwer"));
    }
}
*/
