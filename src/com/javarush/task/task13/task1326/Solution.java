package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String address = reader.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(new FileInputStream(address));
        while (scanner.hasNext()){
            int i = scanner.nextInt();
            list.add(i);
        }
        scanner.close();
        for(int i = 0; i < list.size();){
            if (list.get(i) % 2 != 0)
                list.remove(i);
            else i++;
        }
        Collections.sort(list);
        for (int i : list){
            System.out.println(i);
        }
    }
}