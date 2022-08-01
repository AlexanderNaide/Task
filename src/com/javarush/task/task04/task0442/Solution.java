package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        int s = 0;
        while (!exit){
            int x = Integer.parseInt(reader.readLine());
            s += x;
            exit = (x == -1);

        }
        System.out.println(s);

        //напишите тут ваш код

    }
}