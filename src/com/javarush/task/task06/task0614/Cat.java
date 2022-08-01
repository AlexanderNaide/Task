package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/*
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();
    //напишите тут ваш код

    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }
        System.out.println(cats.size());
        //напишите тут ваш код
        printCats(cats);
    }

    public static void printCats(ArrayList<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }//напишите тут ваш код
    }
}