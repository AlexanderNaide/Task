package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[tab.length - (i + 1)]);
        }

        //напишите тут ваш код
    }
}
