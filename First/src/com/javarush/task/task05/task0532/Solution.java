package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n == 0) {
            //do nothing
        } else {
            int[] arg = new int[n];
            for (int i = 0; i < n; i++) {
                arg[i] = Integer.parseInt(reader.readLine());
                if (arg[0] < arg[i]) {
                    arg[0] = arg[i];
                }
            }
            int maximum = arg[0];
            System.out.println(maximum);
        }
    }
}*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int max1 = Integer.parseInt(reader.readLine());
                if (max1 > maximum) {
                    maximum = max1;
                }
            }
            System.out.println(maximum);
        }
    }
}
