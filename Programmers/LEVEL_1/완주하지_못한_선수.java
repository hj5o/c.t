/*
package Programmers.LEVEL_1;

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for(i=0;i<completion.length;i++)
            if(!participant[i].equals(completion[i]))
                break;


        return participant[i];
    }
    public static void main(String[] args){
        Solution s = new Solution();
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        System.out.println(s.solution(part, comp));
    }
}
*/
