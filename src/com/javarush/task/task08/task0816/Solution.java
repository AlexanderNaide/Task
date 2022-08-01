package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Аникеев", dateFormat.parse("JUNE 9 1988"));
        map.put("Давыдов", dateFormat.parse("JULY 25 1986"));
        map.put("Тимченко", dateFormat.parse("AUGUST 5 1985"));
        map.put("Домарев", dateFormat.parse("SEPTEMBER 14 1991"));
        map.put("Ткаченко", dateFormat.parse("OCTOBER 22 1987"));
        map.put("Пожидаева", dateFormat.parse("NOVEMBER 20 1993"));
        map.put("Лектор", dateFormat.parse("DECEMBER 17 1989"));
        map.put("Линкин", dateFormat.parse("JANUARY 20 1985"));
        map.put("Сухорукова", dateFormat.parse("FEBRUARY 10 1992"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> newMap = new HashMap<>(map);
        for (Map.Entry<String, Date> pair: newMap.entrySet()){
            Date date = pair.getValue();
            int month = date.getMonth();
            String name = pair.getKey();
            if (month > 4 && month < 8){
                map.remove(name);
            }
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}