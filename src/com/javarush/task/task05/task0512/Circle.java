package com.javarush.task.task05.task0512;

/*
Создать класс Circle
*/

public class Circle {
    private int centerX, centerY, radius, width, color;

    public void initialise(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialise(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialise(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}