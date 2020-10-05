package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Newman", "Jhon");
        stringMap.put("Kelly", "Jhon");
        stringMap.put("Lui", "Luk");
        stringMap.put("Dizzy", "Luk");
        stringMap.put("Ryli", "Jhon");
        stringMap.put("Olli", "Vani");
        stringMap.put("Opeal", "Vani");
        stringMap.put("Asdfelo", "Pinter");
        stringMap.put("Kioam", "Petr");
        stringMap.put("Lpoad", "Piore");
        return stringMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String value : map.values()) {
            if (value == name || value.equals(name))
                count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String keys : map.keySet()) {
            if (keys == lastName || keys.equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}






























