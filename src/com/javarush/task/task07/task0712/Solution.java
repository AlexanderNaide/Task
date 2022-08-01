package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        int max = 0;
        for (String s: list){
            min = Math.min(min, s.length());
            max = Math.max(max, s.length());
        }
        for (int i = 0; i < list.size(); ) {
            if (min == list.get(i).length()){
                System.out.println(list.get(i));
                break;
               }
            else if (max == list.get(i).length()){
                System.out.println(list.get(i));
                break;
                }
            else i++;
        }

        //напишите тут ваш код
    }
}