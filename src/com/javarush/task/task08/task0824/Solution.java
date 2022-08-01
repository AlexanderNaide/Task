package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/*
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human vasa = new Human("Вася", true, 66);
        Human valya = new Human("Валя", false, 60);
        Human misha = new Human("Миша", true, 60);
        Human nina = new Human("Нина", false, 58);
        Human sasha = new Human("Александр", true, 36, nina, misha);
        Human nadya = new Human("Надежда", false, 31, valya, vasa);
        Human danya = new Human("Даниил", true, 4, nadya, sasha);
        Human vera = new Human("Вера", false, 2, nadya, sasha);
        Human alisa = new Human("Алиса", false, 1, nadya, sasha);

        System.out.println(vasa);
        System.out.println(valya);
        System.out.println(misha);
        System.out.println(nina);
        System.out.println(sasha);
        System.out.println(nadya);
        System.out.println(danya);
        System.out.println(vera);
        System.out.println(alisa);
        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human mother){
            this(name, sex, age);
            mother.children.add(this);
        }
        public Human (String name, boolean sex, int age, Human mother, Human father){
            this(name, sex, age, mother);
            father.children.add(this);
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}