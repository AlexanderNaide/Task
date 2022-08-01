package com.javarush.task.task20.task2025;

import java.util.*;

/*
Алгоритмы-числа
*/

public class Solution {
// 1000000000 - memory 22180, time = 128
    public static long[][] tab = new long[10][20]; // Подготовленная 1 раз таблица числел, возведенных в степень
    static {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (long) Math.pow(i, j); //Заполняем таблицу (число i в степени j)
            }
        }
    }


    public static long[] getNumbers(long N) {
        long[] result = null;                                  // Создаем возвращаемый массив
        if (N < 0) return result;
        ArrayList<Long> list = new ArrayList<>();              // Создаем список, куда будем скидывать найденные значения

        for (long s = 0; s < N; s++) {                         // Перебираем все числа до N
            char[] xy = String.valueOf(s).toCharArray();       // Получаем массив символов из цифр очередного числа
            int[] x = new int[xy.length];                      // Создаем масссив чисел размером с колличество знаков
            for (int i = 0; i < x.length; i++) {               // Перебираем массив символом и ссыпаем в массив чисел все символы приведенные к числу
                x[i] = Integer.parseInt(String.valueOf(xy[i]));
            }
            int m = x.length;                                  // Число m, равное колличесву цифр
            long a = 0;                                        // Число a, которое будет суммой степеней
            for (int c : x) {                                  // Складываем в число a сумму степеней m цивр c по порядку
                a += tab[c][m];
            }
            if (s == a) {                                      //Если сумма цифр в степени равно самому числу, то добавляем его в список.
                list.add(s);
            }
        }

        result = new long[list.size()];                        // Инициализируем возвращаемый массив размером полученного списка
        for (int i = 0; i < result.length; i++) {              // Перебрасываем полученные значения из списка в массив
            result[i] = (long) list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {

        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000000)));
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































