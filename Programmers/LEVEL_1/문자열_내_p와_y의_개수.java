/*
package Programmers.LEVEL_1;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        s = s.toUpperCase();
        String[] str = s.split("");

        for (int i=0; i<str.length; i++) {
            if (str[i].equals("P")) {
                cnt++;
            } else if (str[i].equals("Y")) {
                cnt--;
            }
        }
        if (cnt == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("pPoooyY"));
    }
}*/
