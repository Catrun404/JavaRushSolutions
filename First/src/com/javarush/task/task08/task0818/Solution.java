package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String,Integer> map = new HashMap<>();
        map.put("Смирнов",600);
        map.put("Иванов",500);
        map.put("Кузнецов",400);
        map.put("Соколов",700);
        map.put("Попов",666);
        map.put("Лебедев",677);
        map.put("Новиков",42);
        map.put("Козлов",0);
        map.put("Морозов",21);
        map.put("Петров",13);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.values().removeIf(salary -> salary < 500);
    }

    public static void main(String[] args) {

    }
}





























