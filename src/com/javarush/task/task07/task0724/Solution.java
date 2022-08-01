package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human sveta = new Human("Света", false, 56);
        Human vasa = new Human("Василий", true,66);
        Human nina = new Human("Нина", false, 70);
        Human misha = new Human("Михаил", true,71);
        Human sasha = new Human("Александр", true,36, misha, nina);
        Human nadia = new Human("Надежда", false,31, vasa, sveta);
        Human dania = new Human("Даниил", true,4, sasha, nadia);
        Human vera = new Human("Вера", false,1, sasha, nadia);
        Human alisa = new Human("Алиса", false,1, sasha, nadia);

        System.out.println(sveta);
        System.out.println(vasa);
        System.out.println(nina);
        System.out.println(misha);
        System.out.println(sasha);
        System.out.println(nadia);
        System.out.println(dania);
        System.out.println(vera);
        System.out.println(alisa);


    // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}