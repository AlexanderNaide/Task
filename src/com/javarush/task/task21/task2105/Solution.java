package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/*
Исправить ошибку. Сравнение объектов
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Solution)) return false;

        Solution n = (Solution) o;

        if (first == null && last == null) return n.first == null && n.last == null;
        if (first == null) return (n.first == null && last.equals(n.last));
        if (last == null) return (n.last == null && first.equals(n.first));

        return first.equals(n.first) && last.equals(n.last);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        if (first != null) result = prime * result + first.hashCode();
        else result = prime * result + 268;
        if (last != null) result = prime * result + last.hashCode();
        else result = prime * result + 234;
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));

    }
}






























