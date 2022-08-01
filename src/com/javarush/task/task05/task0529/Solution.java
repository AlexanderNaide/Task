package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true){
            String t = reader.readLine();
            if (t.equals("Сумма")) break;
            int i = Integer.parseInt(t);
            s += i;
        }
        System.out.println(s);
        //напишите тут ваш код
    }
}