/*
package Programmers.LEVEL_1;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for (int i=0; i<=n; i++) {
            arr[i] = i;
        }
        arr[1] = 0;

        for (int i=2; i*i<=n; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j=i*i; j<=n; j+=i) {
                arr[j] = 0;
            }
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }
        return answer;
//class Solution {
//    public int solution(int n) {
//        int count = 0;
//        int result = 0;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                if (i % j == 0) count++;
//            }
//            if(count == 2) result++;
//            count = 0;
//        }
//
//        return result;
//    }
//
//}
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }
}
*/

