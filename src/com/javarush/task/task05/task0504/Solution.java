package com.javarush.task.task05.task0504;


/*
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat Vaska = new Cat("Васька", 5, 12, 34);
        Cat Murzik = new Cat("Мурзик", 7, 8, 36);
        Cat Mikropol = new Cat("Микрополь", 3,5,28);
        //напишите тут ваш код
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}