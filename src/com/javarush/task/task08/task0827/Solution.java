package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2020"));
        System.out.println(isDateOdd("JANUARY 2 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dateFormat.parse(date));
        DateFormat setDay = new SimpleDateFormat("D");
        int d = Integer.parseInt(setDay.format(calendar.getTime()));
        return (d % 2 != 0);
    }
}
