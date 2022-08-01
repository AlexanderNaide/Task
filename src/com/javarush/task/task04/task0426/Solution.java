package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        String t;
        if (i == 0) t = "Ноль.";
        else {
            if (i > 0) t = "Положительное ";
            else t = "Отрицательное ";
            i = i % 2;
            if (i == 0) t = t + "четное ";
            else t = t + "нечетное ";
            t = t + "число.";
        }
        System.out.println(t);

        //напишите тут ваш код

    }
}