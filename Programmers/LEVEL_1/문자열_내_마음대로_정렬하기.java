/*
package Programmers.LEVEL_1;

import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i=0; i<strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        for (int i=0; i<strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }
        return strings;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(Arrays.toString(s.solution(strings, n)));
    }
}
*/
