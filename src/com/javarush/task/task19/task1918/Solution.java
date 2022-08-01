package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Знакомство с тегами
*/

/*
C:\kn\text2.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(name));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()){
            sb.append(reader.readLine());
        }
        reader.close();
        String tag = args[0];
        Pattern pattern1 = Pattern.compile("<" + tag + ".*?" + ">");
        Pattern pattern2 = Pattern.compile("</" + tag + ">");
        Matcher matcher1 = pattern1.matcher(sb);
        Matcher matcher2 = pattern2.matcher(sb);
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();
        while (matcher1.find()){
            in.add(matcher1.start());
        }
        while (matcher2.find()){
            out.add(matcher2.end());
        }
        ArrayList<Integer> in2 = new ArrayList<>(in);
        Map<Integer, Integer> list = new HashMap<>();
        for (Integer integer : in) {
            list.put(integer, 0);
        }
        for (int i = 0; i < in.size(); ) {
            if (in.size() == 1){
                list.put(in.get(i), out.get(0));
                in.remove(i);
                out.remove(0);
            }
            else{
                for (int j = 0; j < in.size();) {
                    if (j == in.size()-1){
                        list.put(in.get(j), out.get(0));
                        in.remove(j);
                        out.remove(0);
                        j = 0;
                    }
                    else if ((in.get(j) < out.get(0)) && (in.get(j+1) >= out.get(0))){
                        list.put(in.get(j), out.get(0));
                        in.remove(j);
                        out.remove(0);
                        j = 0;
                    }
                    else j++;
                }
            }
        }
        for (int x : in2){
            System.out.println(sb.substring(x, list.get(x)));
        }

    }
}






























