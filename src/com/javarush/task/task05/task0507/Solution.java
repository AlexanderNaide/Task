package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        int b = 0;
        while (true){
            int y = Integer.parseInt(reader.readLine());
            if (y == -1) break;
            a += y;
            b++;

        }
        System.out.println(a / b);






        //напишите тут ваш код
    }
}