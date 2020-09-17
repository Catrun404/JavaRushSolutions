package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        boolean need = true;
        while (need) {
            need = false;
            for (int i = 1; i < 5; i++) {
                if (nums[i-1] > nums[i]) {
                    int buff = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = buff;
                    need = true;
                }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}