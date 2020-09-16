package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date dateToday = new Date();
        SimpleDateFormat formatDateToday = new SimpleDateFormat("dd MM yyyy");
        System.out.println(formatDateToday.format(dateToday));
    }
}
