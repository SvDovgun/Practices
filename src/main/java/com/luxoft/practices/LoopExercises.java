package com.luxoft.practices;

public class LoopExercises {

    public static void main(String[] args) {
        //repeatedText("repeat via while loop_type", 2);
        //repeatedTextDoWhile("repeat via do/while loop_type", 3);
        //repeatedTextFor("repeat via for loop_type", 4);

        String[] cars = {"Ford", "Citroen", "BMW", "Volvo", "Opel"};
        System.out.println(cars.length);
        printArrayList(cars);

        //stopLoopIfEquals(3);
        //skipThisIterationInLoop(4);

    }

    private static void skipThisIterationInLoop(int skipIteration) {
        for (int i = 0; i < 8; i++){
            if (i == skipIteration){
                continue;
            }
            System.out.println(i);
        }
    }

    private static void stopLoopIfEquals(int count4) {
        for(int i = 0; i < 10; i++) {
            if (i == count4) {
                System.out.println("stopped as count is less than 10");
                break;
            }
            System.out.println(i);
        }
    }

    private static void printArrayList(String[] cars) {
        for (String car: cars){
            System.out.println(car);
        }
    }

    private static void repeatedTextFor(String text3, int count3) {
        for (int i = 0; i < count3; i++) {
            System.out.println(text3);
            System.out.println(i);
        }
    }

    private static void repeatedTextDoWhile(String text2, int count2) {
        int i = 1;
        do {
            System.out.println(text2);
            System.out.println(i++);
        }
        while (i < count2);
    }

    private static void repeatedText(String text_for_repeat, int count) {
        int i = 0;
        while (i < count) {
            System.out.println(text_for_repeat);
            //System.out.println(i++);
            i++;
        }
    }
}
