package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = null;
        while (true){
            value = reader.readLine();
            if (value.equals("exit")) break;
            char[] charValue = value.toCharArray();
            boolean tchk = false;
            for (char c : charValue){
                if (c == '.') {
                    tchk = true;
                    break;
                }
            }
                try {
                    if (tchk){
                        double d = Double.parseDouble(value);
                        print(d);
                    }
                    else {
                        int i = Integer.parseInt(value);
                        if (i > 0 && i < 128)
                            print((short) i);
                        else print(i);
                    }
                }catch (Exception e){
                    print((String) value);
                }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}






























