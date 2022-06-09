/*
package Programmers.LEVEL_1;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i=1; i<=count; i++) {
            answer += price*i;
        }
        if (money - answer > 0) {
            return 0;
        } else {
            return answer-money;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 20, 4));
    }
}
*/
