package com.javarush.task.task03.task0303;

/*
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(500, 1.5));
        System.out.println(convertEurToUsd(10, 2.95));//напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;        //напишите тут ваш код

    }
}
