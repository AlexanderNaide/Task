package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Collections;

/*
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]>list = new ArrayList<>();
        Collections.addAll(list, new int[5], new int[2], new int[4], new int[7], new int[0]);
        for (int[] array : list){
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}