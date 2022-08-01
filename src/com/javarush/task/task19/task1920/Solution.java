package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> list = new HashMap<>();
        while (reader.ready()) {
            String str = reader.readLine();
            String[] m = str.split(" ");
            if (list.containsKey(m[0])){
                Double d = list.get(m[0]);
                d = d + Double.parseDouble(m[1]);
                list.put(m[0], d);
            }
            else {
                list.put(m[0], Double.parseDouble(m[1]));
            }
        }
        reader.close();
        ArrayList<Double> pay = new ArrayList<>(list.values());
        Double d = Collections.max(pay);
        ArrayList<String> name = new ArrayList<>();
        for(Map.Entry<String, Double> pair : list.entrySet()){
            if (pair.getValue().equals(d)) name.add(pair.getKey());
        }
        Collections.sort(name);
        for (String s : name){
            System.out.println(s);
        }
    }
}






























