/*
package Programmers.LEVEL_1;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;

        for (int i=0; i<s.length(); i++) {
            if (cnt % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
                cnt++;
            } else {
                arr[i] = arr[i].toLowerCase();
                cnt++;
            }
            if (arr[i].equals(" ")) {
                cnt = 0;
            }
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("try hello world"));
    }
}
*/
