/*
package Programmers.LEVEL_1;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = -1;
        for (int ans : arr) {
            if (num != ans) {
                list.add(ans);
            }
            num = ans;
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}

*/
