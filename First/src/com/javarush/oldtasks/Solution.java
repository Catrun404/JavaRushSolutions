package com.javarush.oldtasks;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static String toCamelCase(String s) {
        char[] cs = s.toCharArray();
        List<Character> chars = new ArrayList<>();


        for (int i = 0; i < cs.length; i++) {
            chars.add(cs[i]);
        }
        for (int i = 0; i < chars.size() - 1; i++) {
            if (chars.get(i).equals('-') || chars.get(i).equals('_')) {
                chars.set(i + 1, Character.toUpperCase(chars.get(i)));
                //chars.remove(i);
            }
        }
        chars.removeIf(ch -> ch.equals('-') || ch.equals('_'));

        return chars.toString();
    }


    public static void main(String[] args) {
        String s = toCamelCase("the-stealth-warrior");
        System.out.println(s);
    }
}