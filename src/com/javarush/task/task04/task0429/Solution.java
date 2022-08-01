package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            int p = 0;
            int o = 0;
            if (a > 0) p++;
            else if (a < 0) o++;
            if (b > 0) p++;
            else if (b < 0) o++;
            if (c > 0) p++;
            else if (c < 0) o++;
            System.out.println("Количество отрицательных чисел: " + o);
            System.out.println("Количество положительных чисел: " + p);


        //напишите тут ваш код

    }
}