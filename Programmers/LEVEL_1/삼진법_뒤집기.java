/*
package Programmers.LEVEL_1;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.push(n % 3);
            n /= 3;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<stack.size(); i++) {
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
        }
        for (int i=0; i<list.size(); i++) {
            answer += list.get(i) * Math.pow(3, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 45;
        System.out.println(s.solution(n));
    }
}*/
