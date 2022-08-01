package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(i, reader.readLine());
        }
        int max = 0;
        for (String n: strings){
            max = Math.max(max, n.length());
        }
        for (String n: strings){
            if (max == n.length())
                System.out.println(n);
        }
        //напишите тут ваш код
    }
}