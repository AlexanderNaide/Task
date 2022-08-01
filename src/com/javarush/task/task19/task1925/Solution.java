package com.javarush.task.task19.task1925;

import java.io.*;

/*
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()){
            String[] str = reader.readLine().split(" ");
            for (String s : str){
                if (s.length() > 6){
                    if (sb.length() == 0) sb.append(s);
                    else sb.append("," + s);
                }
            }
        }
        reader.close();
        writer.write(sb.toString());
        writer.flush();
        writer.close();
    }
}






























