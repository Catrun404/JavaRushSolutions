package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections; //не используется для решения через лямбда выражение


/*
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxLength = 0;//не используется для решения через лямбда выражение
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() > maxLength) //не используется для решения через лямбда выражение
                maxLength = strings.get(i).length(); //не используется для решения через лямбда выражение
        }
        /*Collections.sort(strings, (o1, o2) -> o2.length() - o1.length());
         for (int i = 0; i < 5; i++) {
         if (strings.get(0).length() == strings.get(i).length())
         System.out.println(strings.get(i));
         }*/ //Вариант решения с использованием сортировки коллекции и лямбда выражения
        for (int i = 0; i <5; i++) {
            if (strings.get(i).length() == maxLength)
                System.out.println(strings.get(i));
        }
    }
}