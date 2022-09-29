/*
package Programmers.LEVEL_3;

import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int work : works) {
            pq.add(work);
        }

        while (n > 0) {
            int max = pq.poll();
            pq.add(--max);
            n--;

            if(pq.peek() == 0 && n > 0) {
                break;
            }
        }

        for (Integer num : pq) {
            answer += Math.pow(num, 2);
        }

        if(n != 0) {
            answer = 0;
        }

        return answer;
    }
}*/
