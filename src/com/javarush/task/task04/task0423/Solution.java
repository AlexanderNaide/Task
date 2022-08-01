package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Фейс-контроль
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(reader.readLine());
        if (i > 20)
            System.out.println("И 18 достаточно");

        //напишите тут ваш код

    }
}