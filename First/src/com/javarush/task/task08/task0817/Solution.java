package com.javarush.task.task08.task0817;

import java.util.*;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Илья");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Алексей");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        List<String> tmpName = new LinkedList<>(); //list for duplicate names
        for (var value : copy.values()) {  //double loop for finding duplicates
            int count = 0; //duplicate counter, I don't fckng know how to do it without it
            for (var name : map.values()) {
                if (value.equals(name)) {
                    count++;
                    if (count > 1) {
                        tmpName.add(name);
                        count = 0;
                    }
                }
            }
        }
        for (var name : tmpName) {
            removeItemFromMapByValue(map, name); //according to the task, we MUST use this method
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) { //according to the task, we MUST use this method
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*
        Map<String, String> map = createMap();
        System.out.println("Before clean duplicates");
        for (var val : map.values()) {
            System.out.println(val);
        }
        removeTheFirstNameDuplicates(map);
        System.out.println("After");
        for (var val : map.values()) {
            System.out.println(val);
        }
        */ //use it for check

    }
}






























