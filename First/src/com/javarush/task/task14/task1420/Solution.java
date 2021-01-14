package com.javarush.task.task14.task1420;

/*
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m;
        int n;
        int gcd;

        m = Integer.parseInt(reader.readLine());
        n = Integer.parseInt(reader.readLine());

        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Numbers can't be equals zero or less than zero");
        } else {
            gcd = gcd(m, n);
            System.out.println(gcd);
        }
    }

    //calculating GCD (Greatest Common Divisor)
    public static int gcd(int m, int n) throws Exception {
        if (m == n) {
            return m;
        } else if (m == 1 || n == 1) {
            return 1;
        } else if ((m % 2 == 0) && (n % 2 == 0)) {
            return 2 * gcd(m / 2, n / 2);
        } else if ((m % 2 == 0) && (n % 2 != 0)) {
            return gcd(m / 2, n);
        } else if ((m % 2 != 0) && (n % 2 == 0)) {
            return gcd(m, n / 2);
        } else if ((m % 2 != 0) && (n % 2 != 0) && m < n) {
            return gcd((n - m) / 2, m);
        } else if ((m % 2 != 0) && (n % 2 != 0) && m > n) {
            return gcd((m - n) / 2, n);
        } else {
            throw new Exception("wtf");
        }
    }
}






























