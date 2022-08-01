package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Пунктуация
*/

/*
C:\kn\text2.txt
C:\kn\text3.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readName = bufferedReader.readLine();
        String writName = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(readName));
        BufferedWriter writer = new BufferedWriter(new FileWriter(writName));

        ArrayList<Integer> list = new ArrayList<>();
        while (reader.ready()){
            list.add(reader.read());
        }
        ArrayList<Character> deleteList = new ArrayList<>();
        Collections.addAll(deleteList, '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~', (char)13, (char)10);

        for (int i : list){
            if (!deleteList.contains((char)i)) {
                writer.write(i);
            }
        }

        writer.flush();
        writer.close();
        reader.close();

    }
}






























