package com.javarush.task.task20.task2025;

import java.util.*;

/*
Алгоритмы-числа
*/

public class Solution4 {

    public static long[][] tabS = new long[10][20]; // Подготовленная 1 раз таблица чисел, возведенных в степень
    static {
        for (int i = 0; i < tabS.length; i++) {
            for (int j = 0; j < tabS[i].length; j++) {
                tabS[i][j] = (long) Math.pow(i, j); //Заполняем таблицу (число i в степени j)
            }
        }
    }
    public static StringBuilder sb = new StringBuilder();
    public static ArrayList<Long> tabM = new ArrayList<>();

    public static long[] getNumbers(long N) {
        if (N < 0) return null;
        int a = String.valueOf(N).length();
        int [] l = new int[a];
        Arrays.fill(l, 0);
        int k = a - 1;
        int m = 1;
        while (true){
            if (l[k] == 0){
                l[k] = 1;
                Dis(l);
            }
            else if (l[k] > 0) break;
        }
        return new long[10];
    }

    public static void Dis (int [] l){
        for (int i : l){
            sb.append(i);
        }
        Long s = Long.parseLong(sb.toString());
        tabM.add(s);
        sb.setLength(0);
    }

    public static void main(String[] args) {

        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        /*a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

         */
    }
}































