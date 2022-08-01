package com.javarush.task.jdk13.task05.task0514;

/*
Инициализация объектов
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Владимир", 48);//напишите тут ваш код
    }

    static class Person {
        private String name;
        private int age;
        public void initialize (String name, int age) {
            this.name = name;
            this.age = age;
        }//напишите тут ваш код
    }
}






























