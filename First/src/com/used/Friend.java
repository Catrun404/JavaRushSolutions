package com.used;

/**import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countP = 0;
        int countN = 0;
        int[] abc = {a, b, c};

        for (int i = 0; i < 3; i++) {
            if (abc[i] > 0)
                countP++;
            else if (abc[i] < 0)
                countN++;
        }
        System.out.println("количество отрицательных чисел: " + countN);
        System.out.println("количество положительных чисел: " + countP);
    }
}*/

public class Friend {
    private String name;
    private int age;
    private char sex;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public static void main(String[] args) {

    }
}
