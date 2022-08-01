package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class SolutionB {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Давыдова", 350);
        map.put("Колесов", 400);
        map.put("Тарасов", 450);
        map.put("Зеленская", 670);
        map.put("Линкин", 550);
        map.put("Голубев", 650);
        map.put("Авдеев", 510);
        map.put("Ошурков", 690);
        map.put("Зинченко", 370);
        map.put("Хомутов", 650);
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copyMap = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair: copyMap.entrySet()){
            int price = pair.getValue();
            if (price < 500) map.remove(pair.getKey());
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        System.out.println(map);
        removeItemFromMap(map);
        System.out.println(map);

    }
}