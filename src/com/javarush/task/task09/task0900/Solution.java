package com.javarush.task.task09.task0900;
/*
Свободные фантазии. чтение текста из файла.
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\GVoichuk\\Desktop\\text.txt"));
        String fileString = reader.readLine();
        String fileString2 = reader.readLine();
        System.out.println(fileString);
        System.out.println(fileString2);
    }
}
