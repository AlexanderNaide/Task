package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Выделяем числа
*/

/*
C:\kn\text2.txt
C:\kn\text3.txt
 */

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameRead = reader.readLine();
        String nameWrite = reader.readLine();
        reader.close();

        StringBuilder sb = new StringBuilder();
        BufferedReader readerFile = new BufferedReader(new FileReader(nameRead));
        BufferedWriter writer = new BufferedWriter(new FileWriter(nameWrite));

        while (readerFile.ready()){
            int i = readerFile.read();
            sb.append((char) i);
        }

        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(sb);

        while (matcher.find()){
            writer.write(matcher.group() + ' ');
        }
        readerFile.close();
        writer.flush();
        writer.close();
    }
}






























