package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map <String, String> map = new HashMap<>();
        map.put("January", " is the 1 month");
        map.put("February", " is the 2 month");
        map.put("March", " is the 3 month");
        map.put("April", " is the 4 month");
        map.put("May", " is the 5 month");
        map.put("June", " is the 6 month");
        map.put("July", " is the 7 month");
        map.put("August", " is the 8 month");
        map.put("September", " is the 9 month");
        map.put("October", " is the 10 month");
        map.put("November", " is the 11 month");
        map.put("December", " is the 12 month");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        String result = map.get(month);

        System.out.println(month + result);

        //напишите тут ваш код
    }
}