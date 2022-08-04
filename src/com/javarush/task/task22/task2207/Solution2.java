package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/*
Обращенные слова
*/

//C:\\text2.txt

public class Solution2 {

    public static void main(String[] args) throws IOException {

        String fileString = "";
        Scanner scanner = new Scanner(new File("C:\\text2.txt"));
        while(scanner.hasNext()){
            fileString = scanner.nextLine();
        }

        String[] split = fileString.split(" ");

        System.out.println("firstString: " + split[0]);
        System.out.println("secondString: " + split[1]);
        System.out.println(split[0].equals(split[1]));
    }
}






























