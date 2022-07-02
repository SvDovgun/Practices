package com.luxoft.practices;

public class BooleanExpression {

    public static void  main (String[] args){
        int res = 0;
        boolean results[] = new boolean[16];
        results[0]= booleanExpression(false, false, false, false);
        results[1]= booleanExpression(false, false, false, true);
        results[2]= booleanExpression(false, false, true, false);
        results[3]= booleanExpression(false, false, true, true); //1
        results[4]= booleanExpression(false, true, false, true); //1
        results[5]= booleanExpression(false, true, false, false);
        results[6]= booleanExpression(false, true, true, false); //1
        results[7]= booleanExpression(false, true, true, true);
        results[8]= booleanExpression(true, false, false, false);
        results[9]= booleanExpression(true, false, false, true); //1
        results[10]= booleanExpression(true, false, true, false); //1
        results[11]= booleanExpression(true, false, true, true);
        results[12]= booleanExpression(true, true, false, false); // 1
        results[13]= booleanExpression(true, true, false, true);
        results[14]= booleanExpression(true, true, true, false);
        results[15]= booleanExpression(true, true, true, true);

        for (int i = 0; i < 15; i++) {
            if (results[i] == true) {
                res++;
                System.out.println("Two True is in " + i);
            }
        }
        System.out.println("found = " + res);
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (!a & !b & c & d) | (!a & b & !c & d) |
                (!a & b & c & !d) | (a & !b & !c & d) |
                (a & !b & c & !d) | (a & b & !c & !d);
    }
    // | АБО-  if any = true, then true, else false
    // & І - if both are thue, then true, else false
    // ! ні - true->false ; false->true;


    /*
    Sample Input 1:
            false false false false
    Sample Output 1:
            false

    Sample Input 2:
            true true true true
    Sample Output 2:
            false

    Sample Input 3:
            false false true true
    Sample Output 3:
            true
    */
}
