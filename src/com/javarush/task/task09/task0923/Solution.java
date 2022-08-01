package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] charStr = str.toCharArray();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> consonant = new ArrayList<>();
        for (char g : charStr){
            if (isVowel(g)) vowel.add(g);
            else if (g != ' ') consonant.add(g);
        }
        for (char g : vowel){
            System.out.print(g + " ");
        }
        System.out.println();
        for (char g : consonant){
            System.out.print(g + " ");
        }
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