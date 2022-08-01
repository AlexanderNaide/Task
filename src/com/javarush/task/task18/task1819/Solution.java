package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/*
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(name1));
        ArrayList<String> list = new ArrayList<>();
        while (reader1.ready()){
            list.add(reader1.readLine());
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(name1));
        BufferedReader reader2 = new BufferedReader(new FileReader(name2));
        while (reader2.ready()){
            writer.write(reader2.readLine());
        }
        for (String str : list){
            writer.write(str);
        }
        reader1.close();
        reader2.close();
        writer.flush();
        writer.close();
    }
}






























