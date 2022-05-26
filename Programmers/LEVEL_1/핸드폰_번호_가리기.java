/*
package Programmers.LEVEL_1;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i=0; i<phone_number.length(); i++) {
            if (i<phone_number.length()-4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String phone_number = "01033334444";
        System.out.println(s.solution(phone_number));
    }
}
*/
