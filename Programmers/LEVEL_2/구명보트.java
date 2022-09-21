/*
package Programmers.LEVEL_2;

import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int asc = 0;
        int desc = people.length - 1;
        while (desc >= asc) {
            if (people[desc] + people[asc] <= limit) {
                answer++;
                desc--;
                asc++;
            } else {
                answer++;
                desc--;
            }
        }
        return answer;
    }
}*/
