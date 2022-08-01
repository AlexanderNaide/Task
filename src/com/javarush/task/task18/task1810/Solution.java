package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        while (true){
            inputStream = new FileInputStream(reader.readLine());
            byte[] buffer = new byte[1000];
            int count = 0;
            if (inputStream.available() > 0){
                count = inputStream.read(buffer);
            }
            if (count < 1000){
                reader.close();
                inputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}






























