package com.javarush.task.task12.task1205;

/*
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String text;
        if (o instanceof Cow) text = "Корова";
        else if (o instanceof Dog) text = "Собака";
        else if (o instanceof Whale) text = "Кит";
        else text = "Неизвестное животное";
        return text;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}