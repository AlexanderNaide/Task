package com.javarush.task.task04.task0406;

/*
Программа учета имен
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Василий", "Пупкин");
        System.out.println(cat.fullName);
    }
}