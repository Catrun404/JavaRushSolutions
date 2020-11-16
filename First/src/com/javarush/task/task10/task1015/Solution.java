package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/*
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
            list[i].add("kekw");
            list[i].add("123");
            list[i].add("lol");
        }
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}





























