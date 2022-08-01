package com.javarush.task.task05.task0510;

/*
Кошкоинициация
*/

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialise (String name){
        this.name = name;
        this.weight = 5;
        this.age = 5;
        this.color = "black";
    }

    public void initialise (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public void initialise (String name, int age){
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "black";
    }

    public void initialise (int weight, String color){
        this.weight = weight;
        this.age = 5;
        this.color = color;
    }

    public void initialise (int weight, String color, String address){
        this.weight = weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }



    //напишите тут ваш код
}