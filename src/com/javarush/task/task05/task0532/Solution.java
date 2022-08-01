package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum  = Integer.parseInt(reader.readLine());
        if (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                int x = Integer.parseInt(reader.readLine());
                maximum = maximum > x ? maximum : x;

            }
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}