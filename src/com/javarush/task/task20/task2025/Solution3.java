package com.javarush.task.task20.task2025;

import java.util.*;

/*
Алгоритмы-числа
*/

public class Solution3 {
    // 1000000000 - memory 17023, time = 17
    // 1_000_000_000 - memory 7463(сильно пляшет), time = 11433(ms) при N = 6


    public static long[][] tab = new long[10][19]; // Подготовленная 1 раз таблица чисел, возведенных в степень
    static {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (long) Math.pow(i, j); //Заполняем таблицу (число i в степени j)
            }
        }
    }

    public static ArrayList<Long>GrandList = new ArrayList<>();
    public static int count = 0;


    public static class Colloginer extends Thread{
        private long start, end;
        ArrayList<Long> list = new ArrayList<>();
        public Colloginer(long s, long e){
            this.start = s;
            this.end = e;
        }

        @Override
        public void run() {

            for (long s = start; s < end; s++) {
                if (getA(s)){
                    long a = getS(s);
                    if (a == getS(a) && !list.contains(a)) list.add(a);
                }
            }
            GrandList.addAll(list);
            count--;
        }

    }


    public static long[] getNumbers(long N){
        Long n = N;
        while (n > 0){
            long a = n;
            long x = N/6;
            n -= x;
            if (n > 0){
                Colloginer col = new Colloginer(n, a);
                count++;
                col.start();
            }
            else {
                Colloginer col = new Colloginer(0, a);
                count++;
                col.start();
            }
        }
        while(count!=0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Collections.sort(GrandList);

        for (int i = 0; i < GrandList.size();) {
            if (i == 0) i++;
            else if (GrandList.get(i).equals(GrandList.get(i - 1))) {
                GrandList.remove(i);
            }
            else i++;
        }

        long[] result = new long[GrandList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (long) GrandList.get(i);
        }
        return result;
    }
    public static boolean getA(long l){
        //проверяет порядок цифр в числе на возрастающий порядок
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
        //возвращает массив цифр числа
        int x = length(a);
        int[] xa = new int[x];
        while(a > 0){
            xa[--x] = ((int) (a%10));
            a /= 10;
        }
        return xa;
    }

    public static long getS (long l){
        //возвращает степенную сумму числа
        int[] x = getC(l);
        int m = x.length;
        long a = 0;
        for (int c : x) {
            a += tab[c][m];
        }
        return a;
    }

    private static int length(long value){
        if (value < 10) {
            return 1;
        } else {
            if (value < 100){
                return 2;
            } else {
                if (value < 1_000){
                    return 3;
                } else {
                    if (value < 10_000){
                        return 4;
                    } else {
                        if (value < 100_000){
                            return 5;
                        } else {
                            if (value < 1_000_000){
                                return 6;
                            } else {
                                if (value < 10_000_000){
                                    return 7;
                                } else {
                                    if (value < 100_000_000){
                                        return 8;
                                    } else {
                                        if (value < 1_000_000_000){
                                            return 9;
                                        } else {
                                            if (value < 10_000_000_000L){
                                                return 10;
                                            } else {
                                                if (value < 100_000_000_000L){
                                                    return 11;
                                                } else {
                                                    if (value < 1_000_000_000_000L){
                                                        return 12;
                                                    } else {
                                                        if (value < 10_000_000_000_000L){
                                                            return 13;
                                                        } else {
                                                            if (value < 100_000_000_000_000L){
                                                                return 14;
                                                            } else {
                                                                if (value < 1_000_000_000_000_000L){
                                                                    return 15;
                                                                } else {
                                                                    if (value < 10_000_000_000_000_000L){
                                                                        return 16;
                                                                    } else {
                                                                        if (value < 100_000_000_000_000_000L){
                                                                            return 17;
                                                                        } else {
                                                                            if (value < 1_000_000_000_000_000_000L){
                                                                                return 18;
                                                                            } else {
                                                                                return 19;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args){
//        System.out.println(Long.MAX_VALUE);
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1_000_000_000)));
//        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a));
/*
        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(100000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
 */

    }
}































