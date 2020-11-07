package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] characters = reader.readLine().toCharArray();
        String stringVowel = "";
        String stringRest = "";
        for (int i = 0; i < characters.length; i++) {
            if (isVowel(characters[i])) {
                stringVowel += characters[i] + " ";
            } else if (characters[i] != ' '){
                stringRest += characters[i] + " ";
            }
        }
        System.out.println(stringVowel);
        System.out.println(stringRest);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}





























