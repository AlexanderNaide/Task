package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int x = 1;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) x++;
            else {
                result.add(x);
                x = 1;
            }
        }
        result.add(x);
        int t = 0;
        for (int i: result) {
            t = Math.max(t, i);
        }
        System.out.println(t);//напишите тут ваш код
    }
}