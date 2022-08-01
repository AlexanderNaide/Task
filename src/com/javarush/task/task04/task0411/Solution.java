package com.javarush.task.task04.task0411;

/*
Время года
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (2 < month && month < 6)
            System.out.println("Весна");
        else if (5 < month && month < 9)
            System.out.println("Лето");
        else if (8 < month && month < 12)
            System.out.println("Осень");
        else
            System.out.println("Зима");
        //напишите тут ваш код

    }
}
