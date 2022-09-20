/*
package Programmers.LEVEL_2;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] word = s.split(" ");
        for (int i=0; i<word.length; i++) {
            String ans = "";
            String First = word[i].substring(0, 1);
            ans += First.toUpperCase();
            ans += word[i].substring(1);
            answer += ans;
        }
        return answer;
    }
}*/
