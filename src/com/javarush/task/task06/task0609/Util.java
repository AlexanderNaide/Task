package com.javarush.task.task06.task0609;

/*
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double x = 0;
        x = ((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1));

        x = Math.sqrt(x);
        return x;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(getDistance(0, 8, -1, 9));

    }
}