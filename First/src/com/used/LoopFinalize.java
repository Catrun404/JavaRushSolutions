package com.used;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopFinalize {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String numberString = String.valueOf(number);
        int numberLength = numberString.length();

        for (int i = 0; i < numberLength; i++) {
            int indexNumber = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            if (indexNumber % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
