package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> na3 = new ArrayList<>();
        ArrayList<Integer> na2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i : list){
            if (i % 3 == 0)
                na3.add(i);
            if (i % 2 == 0)
                na2.add(i);
            if (i % 3 != 0 && i % 2 != 0)
                other.add(i);
        }

        printList(na3);
        System.out.println();
        printList(na2);
        System.out.println();
        printList(other);

        //напишите тут ваш код
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }//напишите тут ваш код
    }
}