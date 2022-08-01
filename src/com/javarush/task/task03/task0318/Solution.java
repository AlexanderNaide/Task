package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int t = Integer.parseInt(reader.readLine());
        System.out.println(s + " захватит мир через " + t + " лет. Му-ха-ха!");//напишите тут ваш код

    }
}