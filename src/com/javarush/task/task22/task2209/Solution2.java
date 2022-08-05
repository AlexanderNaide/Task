package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/*
Составить цепочку слов
*/

public class Solution2 {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        reader = new BufferedReader(new FileReader(fileName));

        BufferedReader reader = new BufferedReader(new FileReader("C:\\text.txt"));


        StringBuilder sb = new StringBuilder();
        while(reader.ready()){
            sb.append(reader.readLine()).append(" ");
        }
        System.out.println(sb);
        sb.deleteCharAt(sb.length() - 1);
        //...
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, sb.toString().split(" "));
        StringBuilder result = getLine(list.toArray(new String[0]));
//        StringBuilder result = getChildrenLine555(list.toArray(new String[0]));
        System.out.println("итог: " + result);
    }

    public static StringBuilder getLine(String... words) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, words);
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        list.remove(0);
        String a = sb.substring(sb.length() - 1).toLowerCase();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).substring(0, 1).toLowerCase().equals(a)){
                if (list.size() > 1){
                    String temp = list.get(i);
                    list.remove(i);
                    list.add(0, temp);
                    sb.append(" ").append(getChildrenLine555(list.toArray(new String[0])));
                    break;
                } else {
                    sb.append(" ").append(list.get(i));
                    break;
                }
            }
        }
        return sb;
    }

    public static StringBuilder getChildrenLine555 (String... words){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, words);
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        list.remove(0);
        String a = sb.substring(sb.length() - 1).toLowerCase();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).substring(0, 1).toLowerCase().equals(a)){
                if (list.size() > 1){
                    String temp = list.get(i);
                    list.remove(i);
                    list.add(0, temp);
                    sb.append(" ").append(getChildrenLine555(list.toArray(new String[0])));
                    break;
                } else {
                    sb.append(" ").append(list.get(i));
                    break;
                }
            }
        }
        return sb;
    }

//    public static StringBuilder getChildrenLine (ArrayList<String> oldList){
//        ArrayList<String> list = new ArrayList<>(oldList);
//        StringBuilder sb = new StringBuilder();
//        sb.append(list.get(0));
//        list.remove(0);
//        String a = sb.substring(sb.length() - 1).toLowerCase();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).substring(0, 1).toLowerCase().equals(a)){
//                if (list.size() > 1){
//                    String temp = list.get(i);
//                    list.remove(i);
//                    list.add(0, temp);
//                    sb.append(" ").append(getChildrenLine(list));
//                    break;
//                } else {
//                    sb.append(" ").append(list.get(i));
//                    break;
//                }
//            }
//        }
//        return sb;
//    }
}






























