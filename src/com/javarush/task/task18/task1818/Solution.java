package com.javarush.task.task18.task1818;

import java.io.*;

/*
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        reader.close();
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(name1));
        BufferedReader reader2 = new BufferedReader(new FileReader(name2));
        BufferedReader reader3 = new BufferedReader(new FileReader(name3));
        while (reader2.ready()){
            writer1.write(reader2.read());
        }
        while (reader3.ready()){
            writer1.write(reader3.read());
        }
        writer1.flush();
        writer1.close();
        reader2.close();
        reader3.close();
    }
}






























