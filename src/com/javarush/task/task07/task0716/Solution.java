package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList <String> copiStrings = strings;
        int k = strings.size();
        for (int i = 0; i < k; i++){

            boolean l = false;
            boolean r = false;

            for (int j = 0; j < strings.get(i).length(); j++) {
                char n = strings.get(i).charAt(j);

                if (n == 'л') l = true;
                if (n == 'р') r = true;

            }
            if (l && !r) {
                strings.add(i+1, copiStrings.get(i));
                i++;
            }
            if (r && !l) {
                strings.remove(i);
                i--;
            }

        }//напишите тут ваш код
        return strings;
    }
}