package com.luxoft.practices.leetcode.array;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,3,3,3,5,5,6,6,7,9,9};

        print(nums);
        System.out.println("  ");
        System.out.println("Amount of unique numbers is " + removeDuplicates(nums));
        print(nums);
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        for (int n = i +1; n < nums.length; n++) {
            nums[n] = 0;
        }
        return i + 1;
    }

    private static void print(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            if (i < nums.length - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.println(nums[i]);
            }
        }
    }
}
