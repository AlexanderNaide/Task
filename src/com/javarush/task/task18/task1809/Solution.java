package com.javarush.task.task18.task1809;

import java.io.*;

/*
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameIn = reader.readLine();
        String nameOut = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(nameIn);
        FileOutputStream outputStream = new FileOutputStream(nameOut);
        byte [] buffer = new byte[1000];
        while (inputStream.available() > 0){
            int count = inputStream.read(buffer);
            for (int i = count; i > 0; i--){
                outputStream.write(buffer[i-1]);
            }
        }
        inputStream.close();
        outputStream.close();

    }
}






























