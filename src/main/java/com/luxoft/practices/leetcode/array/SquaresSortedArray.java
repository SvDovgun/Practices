package com.luxoft.practices.leetcode.array;

import java.util.Arrays;

public class SquaresSortedArray {
    //Given an integer array nums sorted in non-decreasing order,
    // return an array of the squares of each number sorted in non-decreasing order.

    public static void main(String[] args) {
        int[] nums = {-3, -5, -1, 0,  8,  4, 11};

        squaresSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void squaresSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        //Arrays.sort(nums);
        sort(nums);
    }

    //Shuttle Sort
    private static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]){ // compare two elements
                 swap(nums, i, i-1);
                for (int z = i-1; (z - 1) >= 0 ; z--) { // compare the min with all previous in array
                    if (nums[z] < nums[z-1]) {
                        swap(nums, z, z-1);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private static void swap(int[] array, int id1, int id2){
        int tmp = array[id1];
        array[id1] = array[id2];
        array[id2] = tmp;
    }

}
