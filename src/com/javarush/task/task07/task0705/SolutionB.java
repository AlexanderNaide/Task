package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Один большой массив и два маленьких
*/

public class SolutionB {
    public static void main(String[] args) throws Exception {
        int[] ar = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(reader.readLine());
        }
        int[] ar1 = Arrays.copyOf(ar, 10);
        int[] ar2 = Arrays.copyOfRange(ar, 10, ar.length);
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        //напишите тут ваш код
    }
}