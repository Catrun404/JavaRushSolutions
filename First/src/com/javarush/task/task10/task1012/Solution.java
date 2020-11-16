package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код
        List<Integer> alphabetCount = new ArrayList(alphabet.size());
        for (int i = 0; i < alphabet.size(); i++) {
            alphabetCount.add(i,0);
        }
        char[] word;
        for (int i = 0; i < list.size(); i++) {
            word = list.get(i).toCharArray();
            for (int k = 0; k < alphabet.size(); k++) {
                for (int j = 0; j < word.length; j++) {
                    if (word[j] == alphabet.get(k)) {
                        alphabetCount.set(k, (alphabetCount.get(k) + 1));
                    }
                }
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + alphabetCount.get(i));
        }
    }
}






























