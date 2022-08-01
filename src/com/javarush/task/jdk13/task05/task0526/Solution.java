package com.javarush.task.jdk13.task05.task0526;

/*
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("man1", 20, "address1");
        Man man2 = new Man("man2", 30, "address2");
        Woman woman1 = new Woman("woman1", 25, "address1");
        Woman woman2 = new Woman("woman2", 35, "address2");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
        //напишите тут ваш код
    }

    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }//напишите тут ваш код
}






























