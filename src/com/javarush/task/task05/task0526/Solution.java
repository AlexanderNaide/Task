package com.javarush.task.task05.task0526;

/*
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Marcus", 38, "LA");
        Man man2 = new Man("Ivan", 36, "Kursk citi");
        Woman woman1 = new Woman("Lisa", 24, "Kursk citi");
        Woman woman2 = new Woman("Anna", 31, "Kursk citi");

        System.out.println(getInfo(man1));
        System.out.println(getInfo(man2));
        System.out.println(getInfo(woman1));
        System.out.println(getInfo(woman2));
        //напишите тут ваш код
    }

    public static String getInfo(Man man){
        return man.name + " " + man.age + " " + man.address;
    }

    public static String getInfo(Woman woman){
        return woman.name + " " + woman.age + " " + woman.address;
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    //напишите тут ваш код
}