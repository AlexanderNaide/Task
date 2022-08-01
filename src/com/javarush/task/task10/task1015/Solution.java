package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[5];
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(String.valueOf(i));
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(String.valueOf(i));
        }
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(String.valueOf(i));
        }
        ArrayList<String> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(String.valueOf(i));
        }
        ArrayList<String> list5 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list5.add(String.valueOf(i));
        }
        list[0] = list1;
        list[1] = list2;
        list[2] = list3;
        list[3] = list4;
        list[4] = list5;
        //напишите тут ваш код
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}