/*
package Programmers.LEVEL_1;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        if (nums.length == 3) {
            for (int i=0; i<nums.length; i++) {
                sum += nums[i];
            }
            if (isPrime(sum)) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else {
            for (int i=0; i<nums.length; i++) {
                for (int j=i+1; j<nums.length; j++) {
                    for (int k=j+1; k<nums.length; k++) {
                        if (isPrime(nums[i] + nums[j] + nums[k])) {
                            answer++;
                        }
                    }
                }
            }
        }


        return answer;
    }
    public boolean isPrime(int x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        }
        for (int i=2; i*i<=x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(s.solution(nums));
    }
}
*/
