package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList <Character> fileSymbol = new ArrayList<>();
        while (reader.ready()){
            fileSymbol.add((char) reader.read());
        }
        reader.close();
        HashMap <Integer, Integer> list =  new HashMap<>();
        for (char c : fileSymbol){
            Integer i = (int)c;
            if (list.containsKey(i)){
                int value = list.get(i);
                value++;
                list.put(i, value);
            }
            else {
                list.put(i, 1);
            }
        }
        ArrayList<Integer> sortedList = new ArrayList<>(list.keySet());
        Collections.sort(sortedList);
        for (int x : sortedList){
            int count = list.get(x);
            System.out.println((char) x + " " + count);
        }
    }
}






























