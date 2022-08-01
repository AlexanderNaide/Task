package com.javarush.task.task05.task0517;

/*
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat (String name){
        this.name = name;
        this.age = 3;
        this.weight = 2;
        this.color = null;
    }

    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
    }

    public Cat (int weight, String color){
        this.weight = weight;
        this.color = color;
        this.name = "Бездомный кот";
        this.address = "Неизвестно";
        this.age = 0;
    }

    public Cat (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = "Чужой домашний кот";
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}