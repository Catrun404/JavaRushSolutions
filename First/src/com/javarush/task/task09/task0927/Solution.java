package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Pussycat", new Cat("Pussycat"));
        catMap.put("Kitty", new Cat("Kitty"));
        catMap.put("Jo", new Cat("Jo"));
        catMap.put("Lol", new Cat("Lol"));
        catMap.put("Kek", new Cat("Kek"));
        catMap.put("Pink", new Cat("Pink"));
        catMap.put("Lolly", new Cat("Lolly"));
        catMap.put("Olli", new Cat("Olli"));
        catMap.put("Ummy", new Cat("Ummy"));
        catMap.put("Liz", new Cat("Liz"));
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}






























