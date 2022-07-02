package com.luxoft.practices;

public class FibonacciNumber {

    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int current ;
        boolean proceed = true;
        System.out.print(first);
        System.out.print(", " + second);

        while(proceed) {
            current = first + second;
            System.out.print(", " + current);
            first = second;
            second = current;
            if (current >= 1000) {
                proceed = false;
            }
        }
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

    }

}
