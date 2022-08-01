package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Массивный максимум
*/

public class SolutionB {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrey = new int[20];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = Integer.parseInt(reader.readLine());
        }
        // создай и заполни массив
        return arrey;
    }

    public static int max(int[] array) {
        Arrays.sort(array);// найди максимальное значение
        return array[array.length-1];
    }
}