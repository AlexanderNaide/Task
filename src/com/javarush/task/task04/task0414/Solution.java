package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int v = 366;
        int o = 365;
        int x = 0;
        int t = (i - (i/400)*400);
        if (t == 0)
            x = v;
        else{
            t = (t - (t/100)*100);
            if (t == 0)
                x = o;
            else{
                t = (t - (t/4)*4);
                if (t == 0)
                    x = v;
                else
                    x = o;
            }
        }
        System.out.println("Колличесто дней в году: " + x);
        //напишите тут ваш код

    }
}