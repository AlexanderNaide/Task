package com.javarush.task.task20.task2026;

/*
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };
        byte[][] a3 = new byte[][]{
                {0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 1, 0}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");

        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");

        int count3 = getRectangleCount(a3);
        System.out.println("count = " + count3 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int kol = 0;
        int x = a.length;
        int y = a[0].length;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (a[i][j] == 1){
                    a = searsh(j, i, a);
                    kol++;
                }

            }
        }
        return kol;
    }

    private static byte[][] searsh (int x, int y, byte[][] a){
        int xE = a.length;
        int yE = a[0].length;
        for (int i = y; i < yE; i++) {
            for (int j = x; j < xE; j++) {
                if(a[i][j] == 0){
                    if (j > x){
                        xE = j+1;
                    }
                    else {
                       yE = i+1;
                    }
                }
            }
        }
        for (int i = y; i < yE; i++) {
            for (int j = x; j < xE; j++) {
                a[i][j] = 0;
            }
        }
        return a;
    }
}






























