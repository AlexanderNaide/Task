package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(2);
        set.add(7);
        set.add(99);
        set.add(14);
        set.add(0);
        set.add(12);
        set.add(3);
        set.add(9);
        set.add(44);
        set.add(6);
        set.add(1);
        set.add(8);
        set.add(-3);
        set.add(17);
        set.add(-88);
        set.add(19);
        set.add(4);
        set.add(-7);
        set.add(24);
        set.add(18);
        return set;
        // напишите тут ваш код

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> res = new HashSet<>(set);
        for (int x : res) {
            if (x > 10)
                set.remove(x);
        }
        return set;
        // напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}