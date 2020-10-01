package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                swap(array, i, i - 1);
                for (int j = i - 1; j - 1 >= 0; j--) {
                    if (array[j] > array[j - 1]) {
                        swap(array, j, j - 1);
                    } else {
                        break;
                    }
                }

            }
        }
    }


    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}






























