/*
package Programmers.LEVEL_2;

import java.util.*;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i=0; i<citations.length; i++) {
            int N = citations.length - i;

            if (citations[i] >= N) {
                answer = N;
                break;
            }
        }
        return answer;
    }
}
*/
