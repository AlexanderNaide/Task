package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  n = reader.readLine();
        int i = n.length();
        int x = Integer.parseInt(n);
        for (int j = 0; j < i; j++) {
            if (x % 2 == 0) even++;
            else odd ++;
            x /= 10;
        }

        System.out.println("Колличество четных чисел: " + even + ", колличество нечетных чисел: " + odd + ".");
        //напишите тут ваш код
    }
}