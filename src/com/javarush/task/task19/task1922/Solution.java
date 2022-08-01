package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Ищем нужные строки
*/

/*
C:\kn\text2.txt
 */

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        String name = nameReader.readLine();
        nameReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(name));
        while (reader.ready()){
            String s = reader.readLine();
            int count = 0;
            for (String t : s.split(" ")){
                if (words.contains(t)) count++;
            }
            if (count == 2) System.out.println(s);
        }
        reader.close();
    }
}






























