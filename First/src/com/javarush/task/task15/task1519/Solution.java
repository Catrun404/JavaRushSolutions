package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp;
        while ((tmp = reader.readLine()).equalsIgnoreCase("exit")) {
            try {
                if (tmp.contains(".")) {
                    try {
                        print(Double.parseDouble(tmp));
                        continue;
                    } catch (NumberFormatException e) {
                        print(tmp);
                    }
                }
                if (Integer.parseInt(tmp) > 0 && Integer.parseInt(tmp) < 129) {
                    try {
                        print(Short.parseShort(tmp));
                        continue;
                    } catch (NumberFormatException e) {
                        print(tmp);
                    }
                }
                if (Integer.parseInt(tmp) < 1 || Integer.parseInt(tmp) > 128) {
                    try {
                        print(Integer.parseInt(tmp));
                    } catch (NumberFormatException e) {
                        print(tmp);
                    }
                }
            } catch (Exception e) {
                print(tmp);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}






























