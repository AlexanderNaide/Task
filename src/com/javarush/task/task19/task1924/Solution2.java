package com.javarush.task.task19.task1924;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Замена чисел
*/

/*
C:\kn\text2.txt
*/

public class Solution2 {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException{

            String str = "10k негритят. Это стоит 1 бакс, а вот это - 12. При этом 34 бакса есть всего.";
            //Pattern p = Pattern.compile("\\b\\d+\\b");
            //Pattern p = Pattern.compile("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
            //Pattern p = Pattern.compile(("\\b(1)\\b|\\b(2)\\b|\\b(3)\\b|\\b(4)\\b|\\b(5)\\b|\\b(6)\\b|\\b(7)\\b|\\b(8)\\b|\\b(9)\\b|\\b(10)\\b|\\b(11)\\b|\\b(12)\\b"));
            Pattern p = Pattern.compile("\\b(1|2|3|4|5|6|7|8|9|10|11|12)\\b");
            Matcher m = p.matcher(str);
            int count = 0;
            while(m.find(count)){
                System.out.println(m.group());
                int a2 = m.end();
                str = m.replaceFirst(map.get(Integer.parseInt(m.group())));
                System.out.println(str);
                count = a2;
                m.reset(str);
                //System.out.println(m.group());
            }
            //str = m.replaceAll("gfyfyf");

            /*
            for (String s : list){
                str = str.replaceFirst(s, map.get(Integer.parseInt(s)));
                System.out.println(s + ": " + str);
            }

             */

            //System.out.println(m.replaceAll(map.get(Integer.parseInt(t))));
        //str = str.replaceFirst(str.substring(m.start(), m.end()), map.get(Integer.parseInt(str.substring(m.start(), m.end()))));
            System.out.println("Итог: " + str);
        }



}































