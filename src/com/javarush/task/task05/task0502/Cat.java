package com.javarush.task.task05.task0502;

/*
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public Cat(int age, int weight, int strength){
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int x = 0;
        if (this.age > anotherCat.age) x++;
        else if (anotherCat.age > this.age) x--;
        if (this.weight > anotherCat.weight) x++;
        else if (anotherCat.weight > this.weight) x--;
        if (this.strength > anotherCat.strength) x++;
        else if (anotherCat.strength > this.strength) x--;
        return x>=1;
        //напишите тут ваш код
    }

    public static void main(String[] args) {

        Cat vaska = new Cat(5, 5,12);
        Cat murzik = new Cat(7, 6, 18);

        System.out.println(vaska.fight(murzik));
        System.out.println(murzik.fight(vaska));

    }
}