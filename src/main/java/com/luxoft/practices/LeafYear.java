package com.luxoft.practices;

import java.util.Scanner;

public class LeafYear {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets know a count of leaf years from the start of our age");
        System.out.println("Please enter a final year");
        int finalYear = scanner.nextInt();

        int leapYears = leapYearCount(finalYear);
        System.out.println("Count of leaf years till your choose is " + "\u001B[33m" + leapYears);
    }

    public static int leapYearCount(int year) {
        int yearCount = 0;
        yearCount = (year / 4)  - (year / 100)  + (year / 400);
        return yearCount;
    }
}
