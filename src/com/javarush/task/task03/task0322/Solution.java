package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader parlamenter = new BufferedReader(new InputStreamReader(System.in));
        String name1 = parlamenter.readLine();
        String name2 = parlamenter.readLine();
        String name3 = parlamenter.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да - да!");//напишите тут ваш код

    }
}