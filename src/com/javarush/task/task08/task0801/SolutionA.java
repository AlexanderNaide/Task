package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set из растений
*/

public class SolutionA {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        set.add("Арбуз");
        set.add("Банан");
        set.add("Вишня");
        set.add("Груша");
        set.add("Дыня");
        set.add("Ежевика");
        set.add("Женьшень");
        set.add("Земляника");
        set.add("Ирис");
        set.add("Картофель");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
        //напишите тут ваш код

    }
}