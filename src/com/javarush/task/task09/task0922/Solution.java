package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat formatIn = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat formatOut = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date = formatIn.parse(reader.readLine());
        System.out.println(formatOut.format(date).toUpperCase(Locale.ROOT));
    }
}
