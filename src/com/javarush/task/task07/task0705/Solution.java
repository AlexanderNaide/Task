package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigTable = new int[20];
        int[] littleTable1 = new int[10];
        int[] littleTable2 = new int[10];

        for (int i = 0; i < bigTable.length; i++) {
            bigTable[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < littleTable1.length; i++) {
            littleTable1[i] = bigTable[i];
        }
        for (int i = 0; i < littleTable2.length; i++) {
            littleTable2[i] = bigTable[i + 10];
        }
        for (int i = 0; i < littleTable2.length; i++) {
            System.out.println(littleTable2[i]);
        }


        //напишите тут ваш код
    }
}