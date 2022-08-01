package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/*
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> set = new HashSet<Dog>();
        set.add(new Dog());
        set.add(new Dog());
        set.add(new Dog());
        //напишите тут ваш код
        return set;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<Object>();
        for (Cat cat : cats)
            pets.add(cat);
        for (Dog dog : dogs)
            pets.add(dog);
        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for (Cat cat: cats)
            pets.remove(cat);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object object : pets) {
            System.out.println(object);
        }//напишите тут ваш код
    }

    public static class Cat{

    }

    public static class Dog{

    }//напишите тут ваш код
}