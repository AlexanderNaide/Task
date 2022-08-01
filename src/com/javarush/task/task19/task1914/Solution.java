package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(console);
        StringBuilder sb = new StringBuilder(String.valueOf(outputStream));

        System.out.println(Resolution(sb));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("8 - 8 = ");
        }
    }

    public static StringBuilder Resolution (StringBuilder sb){
        char[] c = sb.toString().toCharArray();
        sb.setLength(sb.length()-2);
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        int count = 0;
        char z = 0;
        for (int i = 0; i < c.length; i++){
            char f = c[i];
            if (f != ' ') {
                if (count == 0 && !(f == '+' || f == '-' || f == '*')) {
                    a.append(f);
                } else if (f == '+' || f == '-' || f == '*') {
                    z = f;
                    count++;
                } else if (count == 1 && !(f == '=')) {
                    b.append(f);
                } else if (f == '=') break;
            }
        }

        if (z == '+') {
            sb.append(Integer.parseInt(a.toString()) + Integer.parseInt(b.toString()));
        }
        else if (z == '-') {
            sb.append(Integer.parseInt(a.toString()) - Integer.parseInt(b.toString()));
        }
        else if (z == '*') {
            sb.append(Integer.parseInt(a.toString()) * Integer.parseInt(b.toString()));
        }

        return sb;
    }
}































