package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/*
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        reader = new BufferedReader(new FileReader(fileName));

        BufferedReader reader = new BufferedReader(new FileReader("C:\\text.txt"));


        StringBuilder sb = new StringBuilder();
        while(reader.ready()){
            sb.append(reader.readLine()).append(" ");
        }

        sb.deleteCharAt(0);  //   Закомментировать при сдаче

        sb.deleteCharAt(sb.length() - 1);
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, sb.toString().split(" "));
        StringBuilder result = getLine(list.toArray(new String[0]));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, words);
        StringBuilder sb = new StringBuilder();

        if(words.length == 0){
            return sb;
        }

        for (int i = 0; i < list.size(); i++) {
            String one = list.get(i);
            String a = one.substring(one.length() - 1).toLowerCase();
            ArrayList<String> childList = new ArrayList<>(list);
            childList.remove(i);
            for (int j = 0; j < childList.size(); j++) {
                String two = childList.get(j);
                String b = two.substring(0, 1).toLowerCase();
                System.out.println("one: " + one + "      two: " + two);
                System.out.println(a + "-----" + b);
            }

        }





        return sb;
    }
}






























