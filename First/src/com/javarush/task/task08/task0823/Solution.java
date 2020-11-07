package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        string = firstToUpperCase(string);
        System.out.println(string);


    }

    public static String firstToUpperCase(String word) {
        String result = "";
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ( i == 0 || chars[i-1] == ' ') {
                result += Character.toUpperCase(chars[i]);
            } else {
                result += chars[i];
            }
        }
        return result;
    }
}






























