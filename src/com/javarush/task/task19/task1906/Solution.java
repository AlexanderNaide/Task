package com.javarush.task.task19.task1906;

import java.io.*;

/*
Четные символы
*/

/*
C:\kn\text.txt
C:\kn\text2.txt
 */

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameIn = reader.readLine();
        String nameOut = reader.readLine();
        reader.close();
        int i = 1;
        FileReader fileReader = new FileReader(nameIn);
        FileWriter fileWriter = new FileWriter(nameOut);
        while (fileReader.ready()){
            int x = fileReader.read();
            if (i % 2 == 0){
                fileWriter.write(x);
            }
            i++;
        }
        fileReader.close();
        fileWriter.close();
    }
}






























