package com.javarush.task.task09.task0908;

/*
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        String s = null;

        try {
            String m = s.toLowerCase();
        } catch (NullPointerException npe) {
            System.out.println(npe);
        }

        //напишите тут ваш код
    }
}






























