package com.luxoft.practices;

public class ExceptionExercises {

    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        division(a, b);
    }

    private static int division(int a, int b) {
        int c = a/b ;
        return c;
    }
}
