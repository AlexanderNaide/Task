package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (!validate(a, b)) throw new Exception();
            System.out.println(GCF(dividerList(a), dividerList(b)));
    }

    public static ArrayList<Integer> dividerList(int x){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0)
                list.add(i);
        }
        return list;
    }
    public static int GCF(List<Integer> listA, List<Integer> listB){
        int g = 0;
        for (int i = listA.size(); i > 0; i--){
            if (g == 0){
                int x = listA.get(i-1);
                for (int j = listB.size(); j > 0; j--) {
                    int z = listB.get(j-1);
                    if (x == z){
                        g = x;
                        break;
                    }
                }
            }
            else break;
        }
        return g;
    }

    public static boolean validate(int a, int b){
        return a > 0 && b > 0;
    }
}






























