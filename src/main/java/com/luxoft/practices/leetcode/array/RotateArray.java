package com.luxoft.practices.leetcode.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums= {1, 12, 23, 34, 45, 56, 67, 79, 81};

//        print(nums);
        rotateArray(nums, 67);
        print(nums);
    }

    private static void rotateArray(int[] nums, int k) {
        //System.out.println(Arrays.stream(nums).max());
        int t = Arrays.binarySearch(nums, k);
        System.out.println(t);
    }

    private static void print(int[] nums) {
        for (int num:nums) {
            System.out.print(num + " ");
        }
    }
}
