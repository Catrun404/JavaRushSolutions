package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int id;
        String name;
        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            }
            name = reader.readLine();
            if (name.equals("")) {
                break;
            }
            map.putIfAbsent(name, id);
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getValue() + " " + m.getKey());
        }
    }
}






























