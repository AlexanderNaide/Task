package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/*
Собираем файл
*/

/*
C:\kn\text.txt.part1
C:\kn\text.txt.part3
C:\kn\text.txt.part7
C:\kn\text.txt.part2
C:\kn\text.txt.part6
C:\kn\text.txt.part4
C:\kn\text.txt.part5
 */

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        ArrayList<String> list = new ArrayList<>();
        String text = reader.readLine();
        while (!text.equals("end")){
            char[] c = text.toCharArray();
            int t = 0;
            for (int i = c.length - 1; i > 0; i--){
                if (c[i] == '.') {
                    t = i;
                    break;
                }
            }
            if (name == null){
                name = String.copyValueOf(c, 0, t);
                list.add(String.copyValueOf(c, t+1, c.length - t - 1));
            } else {
                list.add(String.copyValueOf(c, t+1, c.length - t - 1));
            }
            text = reader.readLine();
        }
        reader.close();
        Collections.sort(list);
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        for (String part : list){
            BufferedReader reader2 = new BufferedReader(new FileReader(name + "." + part));
            while (reader2.ready()){
                int b = reader2.read();
                writer.write(b);
            }
            reader2.close();
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}






























