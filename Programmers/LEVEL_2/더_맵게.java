/*
package Programmers.LEVEL_2;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.add(i);
        }
        while (pq.peek() < K) {
            if (pq.size() < 2) {
                return -1;
            }
            int m1 = pq.poll();
            int m2 = pq.poll();
            int made = m1 + m2*2;
            pq.add(made);
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(s.solution(scoville, K));
    }
}
*/
