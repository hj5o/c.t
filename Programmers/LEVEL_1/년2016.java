/*
package Programmers.LEVEL_1;

class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] num = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i=0; i<a-1; i++) {
            sum += num[i];
        }
        sum = sum + b - 1;
        String answer = day[sum % 7];
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 24));
    }
}
*/
