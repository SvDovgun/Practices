package com.luxoft.practices;

import java.util.HashMap;
import java.util.Map;

public class StringLinesOperation {

    public static void main(String[] args) {
        System.out.println(test("mamatyce"));
    }

    static Map<Character, Integer> test(String str) {
        System.out.println(str);
        char[] lets = str.toCharArray();

        Map<Character, Integer> duplChar = new HashMap<>();

        for (int i = 0; i < lets.length; i++) {

            if (duplChar.containsKey(lets[i]) == false) {
                duplChar.putIfAbsent(lets[i], 1);
            }
            else {
                Integer edited = duplChar.get(lets[i]).intValue();
                //++edited ;
                duplChar.put(lets[i] , ++edited);
            }
        }
        //System.out.println(duplChar);
        return duplChar;
    }

}
