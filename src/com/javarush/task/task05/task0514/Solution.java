package com.javarush.task.task05.task0514;

/*
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.initialize("Гавр", 31);

        System.out.println(person1.name + ", " + person1.age + " год.");//напишите тут ваш код
    }

    static class Person {

        private String name;
        private int age;

        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
        //напишите тут ваш код
    }
}