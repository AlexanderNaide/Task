package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
Обращенные слова
*/

//C:\\text2.txt

public class Solution3 {

    public static void main(String[] args) throws IOException {

        StringBuilder fileString = new StringBuilder();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\text2.txt"));
        while(reader.ready()){
            fileString.append(reader.readLine());
            fileString.append(" ");
        }
        reader.close();
        fileString.deleteCharAt(0);
        fileString.deleteCharAt(fileString.length() - 1);
        String[] split = fileString.toString().split(" ");


        System.out.println(Arrays.toString(split));
        System.out.println(split[0].equals(split[1]));
        System.out.println(split[2].equals(split[3]));
        System.out.println(split[4].equals(split[5]));
    }
}






























