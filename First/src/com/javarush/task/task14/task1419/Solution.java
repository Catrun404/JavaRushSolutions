package com.javarush.task.task14.task1419;

import java.util.*;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            char[] s = new char[0];
            s[1] = 's';
        } catch (Exception e1) {
            exceptions.add(e1);
        }

        try {
            String x = "";
            int s = Integer.parseInt(x);
        } catch (Exception e2) {
            exceptions.add(e2);
        }
        try {
            Integer x = null;
            byte d = (byte) (127 + x);
        } catch (Exception e3) {
            exceptions.add(e3);
        }
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.close();
            scanner.nextBoolean();
        } catch (Exception e4) {
            exceptions.add(e4);
        }
        try {
            Set<Integer> set = new HashSet<>();
            set.iterator().next().hashCode();
        } catch (Exception e5) {
            exceptions.add(e5);
        }
        try {
            Object o = new Integer(1);
           Solution.class.cast(exceptions);

        } catch (Exception e5) {
            exceptions.add(e5);
        }


    }
}






























