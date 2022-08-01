package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(name);
        int b = 0;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            b = Math.max(b, data);
        }
        inputStream.close();
        System.out.println(b);
    }
}






























