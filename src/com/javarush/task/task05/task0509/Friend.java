package com.javarush.task.task05.task0509;

/*
Создать класс Friend
*/

public class Friend {

    private String name;
    private int age;
    private char sex;

    public void initialise (String name){
        this.name = name;
    }

    public void initialise (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialise (String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}