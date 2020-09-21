package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/*
Продолжаем мыть раму
 */

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        String s = "именно";

        for (int i = 0; i < list.size(); i=i+2) {
            list.add(i+1,s);
        }
        list.stream().forEach(System.out::println);
    }
}
