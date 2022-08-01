package com.javarush.task.task20.task2025;

import java.util.*;

/*
Алгоритмы-числа
*/

public class Solution2 {
    // 1000000000 - memory 10405, time = 69

    public static long[][] tab = new long[10][11]; // Подготовленная 1 раз таблица чисел, возведенных в степень
    static {
        for (int i = 0; i < tab.length; i++) {
            long p = 1;
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = p;
                p *= i;
            }
        }
    }


    public static long[] getNumbers(long N) {
        if (N < 0) return null;
        ArrayList<Long> list = new ArrayList<>();

        for (long s = 1; s < N; s++) {
            if (getA(s)){
                long a = getS(s);
                if (a == getS(a) && !list.contains(a)) list.add(a);
            }
        }
        Collections.sort(list);
        long[] result = new long[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (long) list.get(i);
        }
        return result;
    }
    public static boolean getA(long l){
        int[] a = getC(l);
        int x = 0;
        for (int i : a) {
            if (i == 0);
            else if (i >= x) x = i;
            else {
                return false;
            }
        }
        return true;
    }
    public static int[] getC (long a){
        int[] xa = new int[String.valueOf(a).length()];
        int x = xa.length;
        while(a > 0){
            xa[--x] = ((int) (a%10));
            a /= 10;
        }
        return xa;
    }

    public static long getS (long l){
        int[] x = getC(l);
        int m = x.length;
        long a = 0;
        for (int c : x) {
            a += tab[c][m];
        }
        return a;
    }

    public static void main(String[] args) {

        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
/*
        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
*/
    }
}































