package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        for (int x = 0; x < a; x++){
            for (int y = 0; y < b; y++){
                System.out.print("8");
            }
            System.out.println();
        }


        //напишите тут ваш код

    }
}