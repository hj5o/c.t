/*
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i=0; i<d.length; i++) {
            if (budget - d[i] >= 0) {
                budget -= d[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(s.solution(d, budget));
    }
}
*/
