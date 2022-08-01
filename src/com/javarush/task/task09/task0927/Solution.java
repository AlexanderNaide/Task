package com.javarush.task.task09.task0927;

import java.util.*;

/*
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>();
        Set<Cat>catsSet = new HashSet<>();
        catsSet.add(new Cat("Барсик"));
        catsSet.add(new Cat("Лютка"));
        catsSet.add(new Cat("Гоблин"));
        catsSet.add(new Cat("Чубайс"));
        catsSet.add(new Cat("Кошка Ванька"));
        catsSet.add(new Cat("Рыжик"));
        catsSet.add(new Cat("Мотя"));
        catsSet.add(new Cat("Ельцин"));
        catsSet.add(new Cat("Аппельсин"));
        catsSet.add(new Cat("Хвостик"));
        for (Cat cat : catsSet){
            cats.put(cat.name, cat);
        }
        return cats;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>(map.values());
        return cats;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}