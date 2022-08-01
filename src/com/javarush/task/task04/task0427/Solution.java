package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        String t = "число.";
        if (x > 1 && x < 1000){
        if (x / 100 > 0) t = "трехзначное " + t;
        else if (x / 10 > 0) t = "двухзначное " + t;
        else t = "однозначное " + t;
        if (x % 2 == 0) t = "Четное " + t;
        else t = "Нечетное " + t;
        System.out.println(t);
        }

        //напишите тут ваш код

    }
}