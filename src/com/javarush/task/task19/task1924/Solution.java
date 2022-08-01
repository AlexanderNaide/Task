package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Замена чисел
*/

/*
C:\kn\text2.txt
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(name));
        while (reader.ready()){
            String str = reader.readLine();
            Pattern p = Pattern.compile("\\b(1|2|3|4|5|6|7|8|9|10|11|12)\\b");
            Matcher m = p.matcher(str);
            int count = 0;
            while(m.find(count)){
                int number = Integer.parseInt(m.group());
                str = m.replaceFirst(map.get(number));
                count = m.end();
                m.reset(str);
            }
            System.out.println(str);
        }
        reader.close();
    }
}






























