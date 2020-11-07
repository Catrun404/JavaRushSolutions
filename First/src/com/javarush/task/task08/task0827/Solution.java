package com.javarush.task.task08.task0827;

import java.util.Date;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("May 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dateCheck = new Date(Date.parse(date));
        Date startOfTheYear = new Date(dateCheck.getYear(), 0, 0);
        long days = (dateCheck.getTime() - startOfTheYear.getTime()) / 1000 / 60 / 60 / 24;
        return days % 2 > 0;

    }
}






























