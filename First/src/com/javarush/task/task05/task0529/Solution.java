package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = buffer.readLine();
            if (s.equals("сумма")) {
                break;
            } else {
                sum +=Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}
