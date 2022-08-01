package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Пунктуация
*/

/*
C:\kn\text2.txt
C:\kn\text3.txt
*/

public class Solution2 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readName = bufferedReader.readLine();
        String writName = bufferedReader.readLine();
        bufferedReader.close();
         BufferedReader reader = new BufferedReader(new FileReader(readName));
         BufferedWriter writer = new BufferedWriter(new FileWriter(writName));

        StringBuilder sb = new StringBuilder();
        while (reader.ready()){
            sb.append((char) reader.read());
        }

        Pattern pattern = Pattern.compile("[\\p{Punct}\\n\\r]");
        Matcher matcher = pattern.matcher(sb);

        StringBuffer sbResult = new StringBuffer();

        while(matcher.find()){
            matcher.appendReplacement(sbResult, "");
        }

        writer.write(sbResult.toString());
        writer.flush();
        writer.close();
        reader.close();

    }
}






























