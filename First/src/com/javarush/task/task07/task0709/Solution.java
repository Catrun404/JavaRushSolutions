package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/*
Выражаемся покроче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minLength = 999999999;//не используется для решения через лямбда выражение
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() < minLength) //не используется для решения через лямбда выражение
                minLength = strings.get(i).length(); //не используется для решения через лямбда выражение
        }
        /*Collections.sort(strings, (o1, o2) -> o1.length() - o2.length());
         for (int i = 0; i < 5; i++) {
            if (strings.get(0).length() == strings.get(i).length())
                System.out.println(strings.get(i));
            }*/ //Вариант решения с использованием сортировки коллекции и лямбда выражения
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == minLength)
                System.out.println(strings.get(i));
        }
    }
}