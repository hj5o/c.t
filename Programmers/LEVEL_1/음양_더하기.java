/*
package Programmers.LEVEL_1;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
    public static void main(String args[]) {
        Solution s = new Solution();
        int[] absolute = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(s.solution(absolute, signs));
    }
}
*/
