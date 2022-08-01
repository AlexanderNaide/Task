package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Арбуз", "ягода");
        map.put("Банан", "трава");
        map.put("Вишня", "ягода");
        map.put("Груша", "фрукт");
        map.put("Дыня", "овощ");
        map.put("Ежевика", "куст");
        map.put("Жень-шень", "корень");
        map.put("Земляника", "ягода");
        map.put("Ирис", "цветок");
        map.put("Картофель", "клубень");


        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        //напишите тут ваш код

    }
}