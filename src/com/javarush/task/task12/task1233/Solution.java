package com.javarush.task.task12.task1233;

/*
Изоморфы наступают
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        int a , b = 0;
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        else {
            int i = array[0];
            for (int x : array){
                i = Math.min(x, i);
            }
            a = i;
            for (int x = 0; x < array.length; x++ ){
                if (array[x] == a) 
                    b = x;
            }
        }

        return new Pair<Integer, Integer>(a, b);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}