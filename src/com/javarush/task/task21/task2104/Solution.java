package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/*
Equals and HashCode
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
        if (this == n) return true;
        if (n == null) return false;
        if (!(n instanceof Solution)) return false;
        if (!(n.getClass() == this.getClass())) return false;

        Solution nA = (Solution) n;

        if (first == null && last == null) return (nA.first == null && nA.last == null);
        if (first == null) return (nA.first == null && last.equals(nA.last));
        if (last == null) return (nA.last == null && first.equals(nA.first));
        return (first.equals(nA.first) && last.equals(nA.last));
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        if (first != null) result = prime * result + first.hashCode();
        else result = prime * result + 248;
        if (last != null) result = prime * result + last.hashCode();
        else result = prime * result + 264;
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));

        Solution a = new Solution("Part", "Lock");
        Solution b = new Solution("Part", null);
        System.out.println("*******************");
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() + " + " + b.hashCode() + " = " + (a.hashCode() == b.hashCode()));
    }
}






























