package com.luxoft.practices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercises {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("der");
        arrList.toString();
        System.out.println(arrList.size());

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(3);
        System.out.println(integerArrayList.size());
        Iterator<Integer> it = integerArrayList.iterator();
        while (it.hasNext()){
            Integer element = it.next();
            System.out.println(element);
        }
        for (int arrElemen: integerArrayList    ) {
            System.out.println(arrElemen);

        }


    }
}
