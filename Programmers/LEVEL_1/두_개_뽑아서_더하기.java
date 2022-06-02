/*
package Programmers.LEVEL_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int idx = 0;
        int[] answer = new int[set.size()];
        for (int ans : set) {
            answer[idx++] = ans;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2,1,3,4,1};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}

*/
