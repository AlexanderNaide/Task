package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Считаем слово
*/

/*
C:\kn\text2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = new FileReader(fileName);
        while (fileReader.ready()){
            sb.append((char) fileReader.read());
        }
        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher = pattern.matcher(sb.toString());
        while (matcher.find()) {
            i++;
        }
        System.out.println(i);
        fileReader.close();
    }
}






























