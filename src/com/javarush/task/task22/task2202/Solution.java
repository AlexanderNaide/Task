package com.javarush.task.task22.task2202;

/*
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        try{
            int start = string.indexOf(" ");
            int end = string.indexOf(" ", start + 1);
            for (int i = 2; i < 4 && end != -1; i++) {
                end = string.indexOf(" ", end + 1);
            }
            int finish = string.indexOf(" ", end + 1);
            if (finish == -1 && end != -1){
                return string.substring(start + 1);
            } else {
                return string.substring(start + 1, finish);
            }
        }catch (IndexOutOfBoundsException | NullPointerException e){
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException{
    }
}






























