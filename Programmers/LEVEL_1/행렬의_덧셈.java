/*
package Programmers.LEVEL_1;


import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = s.solution(arr1, arr2);

        System.out.println(Arrays.deepToString(answer));

        if (answer[0][0] == 4 && answer[1][0] == 7 && answer[0][1] == 6 && answer[1][1] == 9) {
            System.out.println("정답");
        } else {
            System.out.println("오답");
        }
    }
}
*/
