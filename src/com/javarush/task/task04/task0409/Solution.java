package com.javarush.task.task04.task0409;

/*
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
        displayClosestToTen(64, 64);
    }

    public static void displayClosestToTen(int a, int b) {
        if (abs(10-a) < abs(10-b))
            System.out.println("Ближайшее k 10 число " + a);// напишите тут ваш код
        else
            System.out.println("Ближайшее k 10 число " + b);// напишите тут ваш код

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}