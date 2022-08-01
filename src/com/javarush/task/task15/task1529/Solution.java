package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
            Solution.reset();
    }

    public static CanFly result;

    public static void reset(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String text = reader.readLine();
            if (text.equals("helicopter")) {
                result = new Helicopter();
            }
            if (text.equals("plane")) {
                int pasCount = Integer.parseInt(reader.readLine());
                result = new Plane(pasCount);
            }
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}






























