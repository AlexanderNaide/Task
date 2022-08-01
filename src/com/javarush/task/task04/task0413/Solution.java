package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        String s;
        if (i == 1) s = "Понедельник";
        else if (i == 2) s = "Вторник";
        else if (i == 3) s = "Среда";
        else if (i == 4) s = "Четверг";
        else if (i == 5) s = "Пятница";
        else if (i == 6) s = "Суббота";
        else if (i == 7) s = "Воскресение";
        else s = "Такого дня недели не существует";
        System.out.println(s);//напишите тут ваш код

    }
}