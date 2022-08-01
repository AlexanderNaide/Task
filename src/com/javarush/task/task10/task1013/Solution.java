package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private String lastname;
        private boolean sex;
        private Human father;
        private String vocation;

        public Human (String name, String lastname, int age){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }

        public Human (String name, String lastname, int age, Human father){
            this(name, lastname, age);
            this.father = father;
        }

        public Human (String name, String lastname, int age, Human father, boolean sex){
            this(name, lastname, age, father);
            this.sex = sex;
        }

        public Human (String name, String lastname, int age, Human father, boolean sex, String vocation){
            this(name, lastname, age, father, sex);
            this.vocation = vocation;
        }

        public Human (String name){
            this.name = name;
        }

        public Human (String name, String lastname){
            this.name = name;
            this.lastname = lastname;
        }

        public Human (String lastname, int age){
            this("Mr.", lastname, age);
        }

        public Human (String name, int age, Human father){
            this(name, father.lastname, age);
            this.father = father;
        }

        public Human (boolean sex, int age){
            this("Mr.", "Smite", age);
            this.sex = sex;
        }

        public Human (String name, String lastname, String vocation){
            this(name, lastname);
            this.vocation = vocation;
        }
    }
}