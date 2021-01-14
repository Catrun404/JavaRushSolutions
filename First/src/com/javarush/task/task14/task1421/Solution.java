package com.javarush.task.task14.task1421;

/*
Singleton
*/

public class Solution {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Yeap!");
        Singleton singleton1 = Singleton.getInstance("Nope...");
        System.out.println(singleton.name);
        System.out.println(singleton1.name);
    }
}






























