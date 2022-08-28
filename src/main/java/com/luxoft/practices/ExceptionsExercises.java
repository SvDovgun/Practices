package com.luxoft.practices;

public class ExceptionsExercises {

    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        division(a, b);

        arrayPrint();

    }

    private static void arrayPrint() {
        try {
            int[] numbers = {12, 23, 34, 45};
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println("ERORRORRRORO!");
        } finally {
            System.out.println("     try/catch block is finished");
        }
    }

    private static int division(int a, int b) {
        int c = 0 ;
        try {
            c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        return c;
    }
}
