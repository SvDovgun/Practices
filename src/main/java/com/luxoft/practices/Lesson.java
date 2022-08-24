package com.luxoft.practices;

public class Lesson {

    public static void main(String[] args){
        double d = 12.5;
        float f = 13.5f;
        long l = 11_111_111_111l;

        System.out.println(isPowerOfTwo(8));
    }

    public static boolean isPowerOfTwo(int value) { //является ли число с основанием два
//        value = Math.abs(value); // number by module
//        Integer b = Integer.bitCount(value);  //
//        return b == 1 ? true : false ; // you implementation here
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
