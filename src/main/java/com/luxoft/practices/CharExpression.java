package com.luxoft.practices;

public class CharExpression {

    public static void main(String[] args) {
//        char a = 98; // в а записывается 98 симол это b
//        char b = 'b'; // в b записывается номер b в unicod это 98
//        char c = (char) (b + 2); // в с записывается символ который в юникоде идет под 100 (b+2=100) это d
//        System.out.println(a); //выводит b
//        System.out.println((int)b); //выводит 98
//        System.out.println((int)c); //выводит 100
//        System.out.println(c); //выводит d

        System.out.println(charExpression(32));
    }


    public static char charExpression(int a) { // get char value from int
        char slesh = '\\';
        return (char) (slesh + a);
    }
}
