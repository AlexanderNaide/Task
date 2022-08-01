package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Мама", "Мыла", "Раму");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0){
                list.add(i+1, "именно");
            }
        }
        for (String t: list){
            System.out.println(t);
        }


        //напишите тут ваш код
    }
}