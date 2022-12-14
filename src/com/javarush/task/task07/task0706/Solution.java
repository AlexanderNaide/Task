package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] home = new int[15];
        for (int i = 0; i < home.length; i++) {
            home[i] = Integer.parseInt(reader.readLine());
        }
        int even = 0;
        int odd = 0;

        for (int i = 0; i < home.length; i++) {
            if (i % 2 == 0)
                even += home[i];
            else
                odd += home[i];
        }

        System.out.println(even > odd ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");

        //напишите тут ваш код
    }
}