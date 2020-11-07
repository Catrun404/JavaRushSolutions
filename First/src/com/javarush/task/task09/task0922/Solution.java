package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Locale eng = new Locale("English");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

        Date parsed = date.parse(reader.readLine());
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy",eng);
        System.out.println(dateFormat.format(parsed).toUpperCase());

    }
}






























