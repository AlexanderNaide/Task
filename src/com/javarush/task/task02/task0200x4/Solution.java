package com.javarush.task.task02.task0200x4;

import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        BigDecimal start = new BigDecimal(0.);
        BigDecimal shag = new BigDecimal(0.1);

        for (int i = 1; i <= 11; i++) {
            start = start.add(shag);
        }

        BigDecimal f = new BigDecimal(0.1);
        BigDecimal mnozg = new BigDecimal(11);
        f = f.multiply(mnozg);

        System.out.println(start);
        System.out.println(f);

        if (start.compareTo(f) == 0)
            System.out.println("Равны");
        else System.out.println("Неравны");


        int x = 100;
        System.out.println(Integer.toBinaryString(x));
    }
}
