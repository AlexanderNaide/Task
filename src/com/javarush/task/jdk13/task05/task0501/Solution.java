package com.javarush.task.jdk13.task05.task0501;

/*
Кошачья бойня(1)
*/

public class Solution {

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;
        //напишите тут ваш код

        public Cat(String name, int age, int weight, int strength){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat){
            int index = 0;
            if (this.age > anotherCat.age) index++;
            else if (this.age < anotherCat.age) index--;
            if (this.weight > anotherCat.weight) index++;
            else if (this.weight < anotherCat.weight) index--;
            if (this.strength > anotherCat.strength) index++;
            else if (this.strength < anotherCat.strength) index--;
            return index > 0;
        }
    }

    public static void main(String[] args) {

        Cat vaska = new Cat("Vaska", 3, 3, 5);
        Cat murzik = new Cat("Murzik", 5, 5, 3);
        Cat sholopay = new Cat("Sholopay", 1, 2, 9);

        System.out.println(vaska.fight(murzik));
        System.out.println(murzik.fight(vaska));
        System.out.println(murzik.fight(sholopay));
        System.out.println(sholopay.fight(murzik));
        System.out.println(sholopay.fight(vaska));
        System.out.println(vaska.fight(sholopay));

    }
}
