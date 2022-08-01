package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader = new BufferedReader(new FileReader(name));
        int id = Integer.parseInt(args[0]);
        while (reader.ready()){
            String line = reader.readLine();
            char[] c = line.toCharArray();
            ArrayList<Character> t = new ArrayList<>();
            for(char x : c){
                if (x == ' ') break;
                else t.add(x);
            }
            int sId = getId(t);
            if (sId == id){
                System.out.println(line);
            }
        }
        reader.close();
    }
    public static int getId(ArrayList<Character> list){
        StringBuilder sb = new StringBuilder();
        for(Character x : list){
            sb.append(x);
        }
        return Integer.parseInt(sb.toString());
    }
}






























