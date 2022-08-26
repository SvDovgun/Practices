package com.luxoft.practices;

import java.util.Scanner;

public class MyClassExercises {

    int x ;

    public MyClassExercises() {
        this.x = 5;
    }

    public static void main(String[] args) {
        MyClassExercises myObj = new MyClassExercises();
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hello, please enter number");
        int w = myScan.nextInt();
        System.out.println("your number is " + w);
        System.out.println("myObj is " + myObj.x);

    }
}
