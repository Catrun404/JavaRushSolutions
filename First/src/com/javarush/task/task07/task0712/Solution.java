package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minLength = 0, maxLength = 0, minIndex = 0, maxIndex = 0;

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
            if (i == 0) {
                minLength = strings.get(0).length();
                maxLength = strings.get(0).length();
                minIndex = i;
                maxIndex = i;
            }
            if (strings.get(i).length() < minLength) {
                minLength = strings.get(i).length();
                minIndex = i;
            }
            if (strings.get(i).length() > maxLength) {
                maxLength = strings.get(i).length();
                maxIndex = i;
            }
        }
        if (minIndex < maxIndex)
            System.out.println(strings.get(minIndex));
        else
            System.out.println(strings.get(maxIndex));
    }
}


/*public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minLength = 9999999;
        int maxLength = 0;
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() < minLength) {
                minLength = strings.get(i).length();
            }
            if (strings.get(i).length() > maxLength) {
                maxLength = strings.get(i).length();
            }
        }
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() == minLength) {
                System.out.println(strings.get(i));
                break;
            } else if (strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}*/