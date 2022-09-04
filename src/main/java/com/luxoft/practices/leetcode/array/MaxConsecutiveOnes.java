package com.luxoft.practices.leetcode.array;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1, 0, 1,1,1,1,1,0,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0;
        int maxMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutive++;
            } else {
                consecutive = 0;
            }
            if (consecutive > maxMax) {
                maxMax = consecutive;
            }
        }

        return  maxMax;
    }
}
