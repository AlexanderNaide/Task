package com.javarush.task.task09.task0905;

/*
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int x = elements.length-1;
        System.out.println(x);
        return x;
        //напишите тут ваш код
    }
}