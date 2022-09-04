package com.luxoft.practices.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.

    public static void main(String[] args) {
        int[] nums = {2, 3, 4 , 7, 10, 11};

       // System.out.println(Arrays.toString(getTwoSum(nums, 8)));
        int[] result = getTwoSum(nums, 7);
        System.out.println(result[0] +"  " + result[1]);
        System.out.println(Arrays.toString(nums));
    }

    // used two points, nothing additional, applied to sorted array
    private static int[] getTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        while (l < r ) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[] {l, r};
            }
            if (sum < target){
                l++;
            } else {
                r--;
            }
        }
        return new int[]{-1, -1};
    }

    // using additional memory for hashMap, but it is faster
//    private static int[] getTwoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> reviewedNumber = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int searchNumber = target - nums[i];
//            if(reviewedNumber.containsKey(searchNumber)){
//                return new int[]{ reviewedNumber.get(searchNumber), i};
//            }
//            reviewedNumber.put(nums[i], i);
//        }
//        return new int[] {-1, -1};
//    }

//    private static int[] getTwoSum(int[] nums, int target) {
//        int[] resMas = {-1, -1};
//        for (int i = 0; i < nums.length-1; i++) {
//            int delta = target - nums[i];
//            for (int j = i+1; j < nums.length; j++) {
//                if ( nums[j] == delta){
//                    resMas[0] = i;
//                    resMas[1] = j;
//                    return resMas;
//                }
//            }
//        }
//        return null;
//    }

}
