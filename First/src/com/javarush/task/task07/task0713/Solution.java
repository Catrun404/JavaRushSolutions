package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> d3Nums = new ArrayList<Integer>();
        ArrayList<Integer> d2Nums = new ArrayList<Integer>();
        ArrayList<Integer> restNums = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            nums.add(i, Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 20; i++) {
            if (nums.get(i) % 3 == 0 && nums.get(i) % 2 == 0) {
                d3Nums.add(nums.get(i));
                d2Nums.add(nums.get(i));
            } else if (nums.get(i) % 3 == 0) {
                d3Nums.add(nums.get(i));
            } else if (nums.get(i) % 2 == 0) {
                d2Nums.add(nums.get(i));
            } else {
                restNums.add(nums.get(i));
            }
        }
        printList(d3Nums);
        printList(d2Nums);
        printList(restNums);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        list.stream().forEach(System.out::println);
    }
}