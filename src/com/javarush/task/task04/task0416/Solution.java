package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        x = x % 5;
        if (x >= 0 && x < 3)
            System.out.println("Зеленый");
        else if (x >= 3 && x < 4)
            System.out.println("Желтый");
        else
            System.out.println("Красный");
        //напишите тут ваш код

    }
}