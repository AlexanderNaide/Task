package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/*
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ирина Владимировна");
        list.add("Пулым Николай");
        list.add("Голубев Игорь");
        list.add("Ошурков Иван");
        list.add("Линкин Анатолий");
        list.add("Александр Петрович");

        int i = list.size();
        System.out.println(i);
        for (int j = 0; j < i; j++) {
            System.out.println(list.get(j));
        }//напишите тут ваш код
    }
}