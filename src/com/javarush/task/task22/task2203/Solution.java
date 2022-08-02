package com.javarush.task.task22.task2203;

/*
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try{
            int start = string.indexOf("\t");
            int end = string.indexOf("\t", start + 1);
            return string.substring(start + 1, end);
        } catch (NullPointerException | StringIndexOutOfBoundsException e){
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
//        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java\t."));
//        System.out.println(getPartOfString("\tJavaRush - лучший сервис обучения Java."));
//        System.out.println(getPartOfString(null));
    }
}






























