/*
package Programmers.LEVEL_1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            min = Math.min(arr[i], min);
        }

        list.remove(list.indexOf(min));
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        return answer;
    }
//        int[] answer = new int[arr.length - 1];
//        int min = arr[0];
//        for (int i=0; i<arr.length; i++) {
//            min = Math.min(min, arr[i]);
//        }
//        int cnt = 0;
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] == min) {
//                continue;
//            }
//            answer[cnt++] = arr[i];
//        }
//
//        if (arr.length == 1) {
//            return new int[]{-1};
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {10};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}*/
