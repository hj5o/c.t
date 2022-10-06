/*
package Programmers.LEVEL_2;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            answer[0]++;
            String chan = s.replace(String.valueOf("0"), "");
            answer[1] += s.length() - chan.length();
            s = Integer.toBinaryString(chan.length()).toString();
        }
        return answer;
    }
}*/
