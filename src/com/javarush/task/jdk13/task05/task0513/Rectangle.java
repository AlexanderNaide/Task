package com.javarush.task.jdk13.task05.task0513;

/*
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize (int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize (int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize (int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize (Rectangle r){
        this.top = r.top;
        this.left = r.left;
        this.width = r.width;
        this.height = r.height;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}






























