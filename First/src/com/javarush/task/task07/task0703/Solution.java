package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayS = new String[10];
        int[] arrayN = new int[10];
        for (int i = 0; i < arrayS.length; i++) {
            arrayS[i] = reader.readLine();
        }
        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = arrayS[i].length();
        }
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println(arrayN[i]);
        }

    }
}