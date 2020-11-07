package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        String month = reader.readLine();
        if (month != null) {
            try {
                int monthByNum = Integer.parseInt(month);
                System.out.println(months.get(monthByNum - 1) + " is the " + month + " month");
            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println(month + " is the " + (months.indexOf(month) + 1) + " month");
            }
        }
    }
}






























