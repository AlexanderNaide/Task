package com.javarush.task.task05.task0505;

/*
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat Vaska = new Cat("Васька", 5, 12, 34);
        Cat Murzik = new Cat("Мурзик", 7, 8, 36);
        Cat Mikropol = new Cat("Микрополь", 3,5,28);

        System.out.println(Vaska.fight(Murzik));
        System.out.println(Vaska.fight(Mikropol));
        System.out.println(Murzik.fight(Mikropol));
        System.out.println(Murzik.fight(Vaska));
        System.out.println(Vaska.fight(Murzik));

        //напишите тут ваш код
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}