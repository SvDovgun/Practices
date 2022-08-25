package com.luxoft.practices;

public class SwitchExercises {

    public static void main(String[] args) {
        switchEx("eng");
    }

    private static void switchEx(String lang) {
        switch (lang) {
            case "eng":
                System.out.println("Hello World!");
                break;
            case "ukr":
                System.out.println("Привіт Світе!");
                break;
            case "rus":
                System.out.println("Привет Мир");
                break;
            default:
                System.out.println("No language choose");
        }
    }
}
