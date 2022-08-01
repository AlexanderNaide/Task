package com.javarush.task.jdk13.task05.task0520;

/*
Заполнить класс прямоугольник (Rectangle)
*/


public class Rectangle {
    public int top, left, width, height;

    public Rectangle (int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle (int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle (int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Rectangle (Rectangle r){
        this.left = r.left;
        this.top = r.top;
        this.width = r.width;
        this.height = r.height;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}






























