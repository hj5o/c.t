/*
package Programmers.LEVEL_2;

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack stack = new Stack();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    answer = false;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(")()("));
    }
}*/
