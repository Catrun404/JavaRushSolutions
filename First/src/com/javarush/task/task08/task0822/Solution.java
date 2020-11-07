package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        if (array.isEmpty()) {
            return 0;
        } else {
            Collections.sort(array, Comparator.naturalOrder());
            return array.iterator().next();
        }
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> integerList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                integerList.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            System.out.println("type an integer number plz");
            return integerList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return integerList;
    }
}






























