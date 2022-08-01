package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Линкин", "Анатолий");
        map.put("Хомутов", "Роман");
        map.put("Пулым", "Николай");
        map.put("Ошурков", "Иван");
        map.put("Кузнецов", "Дмитрий");
        map.put("Припачкин", "Дмитрий");
        map.put("Авдеев", "Александр");
        map.put("Миронов", "Дмиртий");
        map.put("Голубев", "Игорь");
        map.put("Грищенко", "Вадим");
        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int x = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if (value.equals(name)) x++;
        }
        return x;
        //напишите тут ваш код
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int x = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if (key.equals(lastName)) x++;
        }
        return x;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
    }
}