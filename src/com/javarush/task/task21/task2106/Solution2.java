package com.javarush.task.task21.task2106;

import java.util.Date;

/*
Ошибка в equals/hashCode
*/

public class Solution2 {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution2 solution;

    public Solution2(int anInt, String string, double aDouble, Date date, Solution2 solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    public Solution2(int anInt, String string, double aDouble, Date date) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Solution2)) return false;

        Solution2 solution1 = (Solution2) o;

        if (anInt != 0 ? anInt != solution1.anInt : solution1.anInt != 0) return false;
        if (string != null ? !string.equals(solution1.string) : solution1.string != null) return false;
        if (aDouble != 0.0 ? (Double.compare(solution1.aDouble, aDouble) != 0) : solution1.aDouble != 0.0) return false;
        if (date != null ? !date.equals(solution1.date) : solution1.date != null) return false;
        if (solution != null ? !solution.equals(solution1.solution) : solution1.solution != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = anInt != 0 ? anInt : 962;
        temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
        result = string != null ? result + 31 * string.hashCode() : result + 31 * 215;
        result = date != null ? 31 * result + 31 * date.hashCode() : result + 31 * 219;
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        result = 31 * result + (int) (temp ^ (temp >>> 32));

        return result;
    }

    public static void main(String[] args) {

        Date d = new Date();

        Solution2 x = new Solution2(34, "vasja", 6.852, d);

        Solution2 a = new Solution2(34, "vasja", 6.852, d, x);
        Solution2 b = new Solution2(34, "vasja", 6.852, d, x);


        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());

        System.out.println(a.hashCode() + " / " + b.hashCode());

    }
}






























