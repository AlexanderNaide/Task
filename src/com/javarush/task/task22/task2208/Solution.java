package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> paramsIvan = new LinkedHashMap<>();
        paramsIvan.put("name", "Иван");
        paramsIvan.put("country", "Россия");
        paramsIvan.put("city", "Санкт-Петербург");
        paramsIvan.put("age", "34");

        HashMap<String, String> paramsIgor = new HashMap<>();
        paramsIgor.put("name", "Игорь");
        paramsIgor.put("country", null);
        paramsIgor.put("city", null);
        paramsIgor.put("age", "28");

        HashMap<String, String> paramsMaria = new HashMap<>();

        System.out.println(getQuery(paramsIvan));
        System.out.println(getQuery(paramsIgor));
        System.out.println(getQuery(paramsMaria));


    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (sb.length() != 0 && entry.getValue() != null){
                sb.append(String.format(" and %s = '%s'", entry.getKey(), entry.getValue()));
            } else if (entry.getValue() != null){
                sb.append(String.format("%s = '%s'", entry.getKey(), entry.getValue()));
            }
        }

        return sb.toString();
    }
}






























