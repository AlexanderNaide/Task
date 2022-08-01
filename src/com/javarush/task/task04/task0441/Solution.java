package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x = 0;

        if (a > b && a > c){
            x = Math.max(b, c);
        }
        else if (b > a && b > c){
            x = Math.max(a, c);
        }
        else x = Math.max(a, b);


        System.out.println(x);



        //напишите тут ваш код

    }
}