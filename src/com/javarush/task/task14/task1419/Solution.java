package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Solution sol = new Solution();
            sol.clone();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] a = new int[10];
            a[15] = 55;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {


        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}






























