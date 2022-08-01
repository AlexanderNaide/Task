package com.javarush.task.task02.task0213;

/*
Питомцам нужны люди
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman marsi = new Woman();
        Woman rosi = new Woman();
        marsi.name = "Marsi";
        rosi.name = "Rosi";
        cat.owner = rosi;
        dog.owner = marsi;
        fish.owner = marsi;
        System.out.println(fish.owner.name + "," + cat.owner.name);//напишите тут ваш код
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
        public String name;
    }
}