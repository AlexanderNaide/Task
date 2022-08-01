package com.javarush.task.task03.task0307;

/*
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg("Леша");
        Zerg zerg2 = new Zerg("Саша");
        Zerg zerg3 = new Zerg("Вася");
        Zerg zerg4 = new Zerg("Миша");
        Zerg zerg5 = new Zerg("Толик");

        Protoss protoss1 = new Protoss("Женя");
        Protoss protoss2 = new Protoss("Даша");
        Protoss protoss3 = new Protoss("Михаллна");

        Terran terran1 = new Terran("Роман");
        Terran terran2 = new Terran("Иван");
        Terran terran3 = new Terran("Анатолий");
        Terran terran4 = new Terran("Ииигорь");

        System.out.println(zerg1.name);//напишите тут ваш код

    }

    public static class Zerg {
        public String name;
        public Zerg(String name){
            this.name = name;
        }
    }

    public static class Protoss {
        public String name;
        public Protoss(String name){
            this.name = name;
        }
    }

    public static class Terran {
        public String name;
        public Terran(String name){
            this.name = name;
        }
    }
}