package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int [] numbers = getInts(reader, 20);

        maximum = numbers[0];
        minimum = numbers[0];
        for (int i: numbers) {
            minimum = Math.min(minimum, i);
            maximum = Math.max(maximum, i);
        }
        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts(BufferedReader reader, int t) throws IOException {
        int [] list = new int[t];
        for (int i = 0; i < t; i++) {
            String x = reader.readLine();
            list[i] = Integer.parseInt(x);
        }

        return list;
    }//напишите тут ваш код
}