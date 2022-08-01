package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x = 0;
        if (a < b){
            x = a;
            a = b;
            b = x;
        }
        if (b < c){
            if (a < c){
                x = a;
                a = c;
                c = b;
                b = x;
            }
            else {
                x = b;
                b = c;
                c = x;
            }

        }

        System.out.println(a + " " + b + " " + c);
        //напишите тут ваш код

    }
}