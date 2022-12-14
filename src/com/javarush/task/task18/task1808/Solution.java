package com.javarush.task.task18.task1808;

import java.io.*;

/*
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream1 = new FileOutputStream(name2);
        FileOutputStream outputStream2 = new FileOutputStream(name3);
        byte[] buffer = new byte[1000];
        while(inputStream.available() > 0){
            int count = inputStream.read(buffer);
            if (count % 2 != 0) {
                outputStream1.write(buffer, 0, count/2+1);
                outputStream2.write(buffer,count/2+1, count/2);
            }
            else {
                outputStream1.write(buffer, 0, count/2);
                outputStream2.write(buffer,count/2, count/2);
            }
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}






























