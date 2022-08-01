package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        while (reader.ready()){
            input.addAll(Arrays.asList(reader.readLine().split(" ")));
        }
        reader.close();
        for (String s : input){
            char[] c = s.toCharArray();
            for (Character c1 : c) {
                try {
                    int i = Integer.parseInt(String.valueOf(c1));
                    output.add(s);
                    break;
                } catch (NumberFormatException ignored) {
                }
            }
        }
        for (String s : output){
            writer.write(s + " ");
        }
        writer.flush();
        writer.close();


    }
}






























