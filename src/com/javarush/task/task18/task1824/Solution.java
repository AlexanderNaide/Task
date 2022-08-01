package com.javarush.task.task18.task1824;

import java.io.*;

/*
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        FileReader fileReader;
        while (true){
            name = reader.readLine();
            try {
                fileReader = new FileReader(name);
            } catch (FileNotFoundException e){
                System.out.println(name);
                break;
            }
            fileReader.close();
        }
        reader.close();
    }
}






























