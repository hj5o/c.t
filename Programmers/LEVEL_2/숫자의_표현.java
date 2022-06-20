/*
package Programmers.LEVEL_2;

class Solution {
    public int solution(int n) {
        int answer = 1;

        for(int i=1; i<=n/2; i++){
            int result = 0;
            int j = i;
            while(result < n) {
                result += j++;
            }
            if(result == n) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(15));
    }
}
*/
