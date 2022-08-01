package com.javarush.task.task10.task1011;

/*
Большая зарплата
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] array = text.toCharArray();
        for (int i = 0; i < 40; i++) {
            char[] arrayCopy = Arrays.copyOfRange(array, i, array.length);
            System.out.println(arrayCopy);
        }

        //напишите тут ваш код
    }

}