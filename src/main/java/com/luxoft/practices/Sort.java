package com.luxoft.practices;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Sort {

    public static void main(String[] args){
        //        LocalDateTime start = LocalDateTime.now();//.of(1, 20, 25, 1024);
//        System.out.println(start);

    //    int[] array = {10, 2, 10, 3, 1, 2, 5};
    //    simpleSort(array);

    //    int[] arrayB = {10, 2, 10, 3, 1, 2, 5};
    //    sortBubles(arrayB);

        int[] arrayS = {10, 2, 10, 3, 1, 2, 5};
        sortSelection(arrayS);

//        LocalDateTime end = LocalDateTime.now(); //.of(3, 22, 27, 1544);
//        System.out.println(end);
//        double dur= Duration.between(start, end).getNano();
//        double durSec= Duration.between(start, end).getSeconds();
//        System.out.println(dur + "    "  + durSec);
    }

    private static void simpleSort(int[] array) {
        System.out.println("simpleSort" +Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i-1);
            }
        }
        System.out.println("simpleSort end" + Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int i1) {
        int tmp = array[i];
        array[i] = array[i1];
        array[i1] = tmp;
    }

    private static void sortBubles(int[] array) { //Простейшая сортировка (Bubble Sort)
        System.out.println("sortBubles" + Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println("sortBubles end" +Arrays.toString(array));
    }

    private static void sortSelection(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }
}
