package com.javarush.task.task01.task0129;

/*
Считаем длину окружности
*/

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double pi = 3.141593;
        double l = 2*pi*radius;
        System.out.println(l);//напишите тут ваш код
    }
}