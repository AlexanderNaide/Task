package com.javarush.task.task04.task0434;

/*
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            int x = 1;
            while (x <= 10){
                System.out.print(i * x + " ");
                x++;
            }
            System.out.println();
            i++;
        }
        //напишите тут ваш код

    }
}