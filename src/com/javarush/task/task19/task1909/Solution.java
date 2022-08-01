package com.javarush.task.task19.task1909;

import java.io.*;

/*
Замена знаков
*/

/*
C:\kn\text2.txt
C:\kn\text3.txt
 */

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readName = bufferedReader.readLine();
        String writeName = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(readName));
        BufferedWriter writer = new BufferedWriter(new FileWriter(writeName));

        while (reader.ready()){
            int i = reader.read();
            if ((char) i == '.') i = '!';
            writer.write(i);
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}






























