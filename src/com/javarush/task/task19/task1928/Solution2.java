package com.javarush.task.task19.task1928;

import java.io.IOException;

/*
Исправить ошибку. Классы и интерфейсы
*/

public class Solution2 {
    {
        System.out.println("This is the Solution class");
    }

    public static void main(String... args) throws IOException {



            int value = 123_456_789;
            System.out.println(value);

            Example result = null;
            String s = "a";
            switch (s) {
                case "a": {
                    result = new Solution2().new A();
                    break;
                }
                case "b": {
                    result = new Solution2().new B();
                    break;
                }
                case "c": {
                    result = new Solution2().new C();
                    break;
                }
            }

            if (result instanceof A) {
                C p = (C) result;
                System.out.println(p.getClass().getSimpleName());
            }

    }

    interface Example {
    }

    class A implements Example {
        {
            System.out.println("This is the A class");
        }
    }

    class B implements Example {
        {
            System.out.println("This is the B class");
        }
    }

    class C extends A {
        {
            System.out.println("This is the C class");
        }
    }
}





























