package com.luxoft.practices;

public class ExceptionsExercises {

    public static void main(String[] args) {

        try {
            int[] numbers = {12, 23, 34, 45};
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println("ERORRORRRORO!");
        } finally {
            System.out.println("     try/catch block is finished");
        }
    }
}
