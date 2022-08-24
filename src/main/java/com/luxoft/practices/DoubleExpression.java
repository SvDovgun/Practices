package com.luxoft.practices;

import java.math.*;

public class DoubleExpression {

    public static void main (String[] args) {
    //    boolean res = doubleExpression(0.1, 0.2, 0.3);
    //    System.out.println(res);

     //   double tt = 0x0bp3;

     //   int flipRes = flipBit(0, 1);
     //   System.out.println(flipRes);

        byte b = -1;
     //   b >>>= 30;
        b >>>= 7;
        System.out.println(b);

    }

    private static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a+b-c) < 1e-4;
       // return a*10 + b*10 == c*10;
    }

    private static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1); // put your implementation here
    }
}
