package com.javarush.task.task02.task0216;

/*
Минимум трёх чисел
*/

public class Solution {
    public static int min(int a, int b, int c) {
        int n, m;
        if (a < b) n = a;
        else n = b;
        if (n < c) m = n;
        else m = c;
        return m;//напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}