package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chars = string.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            if (j == 0 || chars[j-1] == ' ')
                chars[j] = Character.toUpperCase(chars[j]);
        }
        System.out.println(new String(chars));
        //напишите тут ваш код
    }
}