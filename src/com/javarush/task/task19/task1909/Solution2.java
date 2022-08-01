package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Замена знаков
*/

/*
C:\kn\text2.txt
C:\kn\text3.txt
 */

public class Solution2 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readName = bufferedReader.readLine();
        String writeName = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(readName));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()){
            sb.append((char) reader.read());
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(writeName));
        Pattern pattern = Pattern.compile("[.]");
        Matcher matcher = pattern.matcher(sb);
        StringBuffer result = new StringBuffer();

        while(matcher.find()){
            matcher.appendReplacement(result, "!");
        }
        writer.write(result.toString());

        writer.flush();
        reader.close();
        writer.close();
    }
}






























