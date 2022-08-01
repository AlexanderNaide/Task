package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Петр");
        map.put("Петров", "Иван");
        map.put("Димидов", "Василий");
        map.put("Клюев", "Петр");
        map.put("Голдинов", "Георгий");
        map.put("Шатохин", "Максим");
        map.put("Марченко", "Сергей");
        map.put("Шатохин", "Дмитрий");
        map.put("Ивашкин", "Георгий");
        map.put("Шофоростова", "Елизавета");

        //напишите тут ваш код
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}