package com.javarush.task.task05.task0511;

/*
Создать класс Dog
*/

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialise (String name) {
        this.name = name;
    }

    public void initialise (String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialise (String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }


    //напишите тут ваш код

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.initialise("Venya", 22, "black");

        System.out.println(dog1.color);

    }
}