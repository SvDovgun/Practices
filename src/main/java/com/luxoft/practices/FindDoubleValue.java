package com.luxoft.datastructures;

public class FindDoubleValue {

    public static void main(String[] args){

        int[] mas= {1,2,3,4,3,4};

        findDoubleValueIndex(mas);

    }

    private static int findDoubleValueIndex(int[] mas) {
        int doubleIndex = 0;

        for (int i = 0; i < mas.length; i++){
            for (int j = i+1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    doubleIndex = j;
                    System.out.println("value["+ i+ "]=" + mas[i] + " has double value[" + doubleIndex + "]=" + mas[doubleIndex]);
                    return doubleIndex;
                }
            }
           // System.out.println(mas[i]);
        }

        return doubleIndex;
    }
}
