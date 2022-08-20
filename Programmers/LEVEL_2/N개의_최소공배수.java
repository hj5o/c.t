/*
package Programmers.LEVEL_2;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        answer = arr[0];
        for (int i=1; i<arr.length; i++) {
            int val = gcd(answer, arr[i]);
            answer = answer * arr[i] / val;
        }
        return answer;
    }
    static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
*/
