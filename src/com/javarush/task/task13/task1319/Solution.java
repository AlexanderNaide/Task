package com.javarush.task.task13.task1319;

import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String address = reader.readLine();
        BufferedWriter writter = new BufferedWriter(new FileWriter(address));
        while (true){
            String text = reader.readLine();
            writter.write(text);
            writter.write("\r\n");
            if (text.equals("exit")) break;
        }
        writter.close();
    }
}