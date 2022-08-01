package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int n = list.size();
        ArrayList<Integer> minMax = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int min = list.get(0);
            for (int j = 0; j < list.size(); j++) {
                if (min > list.get(j)) min = list.get(j);
            }
            minMax.add(min);
            list.remove((Integer) min);
        }
        for (int i = 0; i < minMax.size(); i++) {
            System.out.println(minMax.get(i));
        }


        //напишите тут ваш код
    }
}