package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        Map<Integer, Integer> count = new HashMap<>();
        FileInputStream inputStream = new FileInputStream(name);
        while (inputStream.available() > 0){
            int data = inputStream.read();
            if (!count.containsKey(data)) {
                count.put(data, 1);
            }
            else {
                int value = count.get(data);
                value++;
                count.replace(data, value);
            }
        }
        inputStream.close();
        for (Map.Entry <Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue().equals(Collections.min(count.values())))
                System.out.print(entry.getKey() + " ");
        }
    }
}






























