package com.javarush.task.task08.task0819;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {

        Cat vaska = new Cat();
        Cat barsik = new Cat();
        Cat tim = new Cat();
        Set<Cat> cats = new HashSet<>(Arrays.asList(vaska, barsik, tim));
        //напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat: cats) {
            System.out.println(cat);
        }// step 4 - пункт 4
    }

    public static class Cat{

        public Cat(){
        }

    }// step 1 - пункт 1
}