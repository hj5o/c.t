/*
package Programmers.LEVEL_1;

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i=0; i<completion.length; i++) {
            if (participant[i] != completion[i]) {
                answer = participant[i];
                break;
            }
        }
        if (answer == "") {
            answer += participant[participant.length-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(s.solution(participant, completion));
    }
}
*/
