/*
package Programmers.LEVEL_1;

import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];
        double[] fRate = new double[N];
        for (int i=1; i<=N; i++) {
            int stage = i;
            double fail = 0;
            double pass = 0;
            for (int j=0; j<stages.length; j++) {
                if (stage <= stages[j]) {
                    pass++;
                }
                if (stage == stages[j]) {
                    fail++;
                }
            }
            if (fail == 0) {
                fRate[i-1] = 0;
                continue;
            }
            fRate[i-1] = fail / pass;
        }
        for (int i=0; i<fRate.length; i++) {
            double max = Integer.MIN_VALUE;
            int idx = 0;
            for (int j=0; j<fRate.length; j++) {
                if (max < fRate[j]) {
                    max = fRate[j];
                    idx = j;
                }
            }
            fRate[idx] = Integer.MIN_VALUE;
            answer[i] = idx + 1;
        }
        return answer;
    }
    public static void main(String args[]) {
        Solution s = new Solution();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(s.solution(N, stages)));
    }
}
*/
