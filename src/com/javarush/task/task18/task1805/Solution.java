package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        ArrayList<Integer> count = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(name);
        while (inputStream.available() > 0){
            int data = inputStream.read();
            if (!count.contains(data)) {
                count.add(data);
            }
        }
        inputStream.close();
        Collections.sort(count);
        for (int i : count) {
            System.out.print(i + " ");
        }
    }
}






























