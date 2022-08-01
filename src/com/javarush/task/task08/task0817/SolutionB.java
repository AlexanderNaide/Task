package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class SolutionB {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Давыдова", "Юлия");
        map.put("Колесов", "Александр");
        map.put("Тарасов", "Сргей");
        map.put("Зеленская", "Юлия");
        map.put("Линкин", "Анатолий");
        map.put("Голубев", "Игорь");
        map.put("Авдеев", "Александр");
        map.put("Ошурков", "Иван");
        map.put("Зинченко", "Александр");
        map.put("Хомутов", "Роман");
        return map;
        //напишите тут ваш код
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> newMap = new HashMap<>(map);
        for (Map.Entry<String, String> pair: newMap.entrySet()){
            String name = pair.getValue();
            int control = 0;
            for (Map.Entry<String, String> pair2: newMap.entrySet()){
                String controlName = pair2.getValue();
                if (name.equals(controlName)) control++;
            }
            if (control > 1) removeItemFromMapByValue(map, name);
        }
        //напишите тут ваш код
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
}