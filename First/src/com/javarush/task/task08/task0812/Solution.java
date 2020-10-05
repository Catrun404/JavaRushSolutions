package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int maxSequence = 1;
        int tmpSequence = 1;
        int next;
        int previous;
        List<Integer> nums = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            nums.add(Integer.parseInt(reader.readLine()));
        }

        Iterator<Integer> iter = nums.iterator();

        previous = iter.next();
        while (iter.hasNext()) {
            next = iter.next();
            if (next == previous) {
                tmpSequence++;
                if (tmpSequence >= maxSequence) {
                    maxSequence = tmpSequence;
                }
            } else {
                tmpSequence = 1;
            }
            previous = next;
        }
        System.out.println(maxSequence);
    }
}





























