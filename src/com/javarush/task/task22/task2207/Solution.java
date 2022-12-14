package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Обращенные слова
*/

//C:\\text.txt

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        StringBuilder sb = new StringBuilder();
        reader = new BufferedReader(new FileReader(fileName));
        while(reader.ready()){
            sb.append(reader.readLine());
            sb.append(" ");
        }
        reader.close();
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, sb.toString().split(" "));
        boolean tr;
        for (int i = 0; i < list.size(); ) {
            tr = false;
            String firstString = list.get(i);
            for (int j = i + 1; j < list.size(); ) {
                String secondString = list.get(j);
                StringBuilder secondStringBuilder = new StringBuilder(secondString);
                secondStringBuilder.reverse();

                if (firstString.equals(secondStringBuilder.toString())){
                    Pair pair = new Pair();
                    pair.first = firstString;
                    pair.second = secondString;
                    result.add(pair);
                    list.remove(firstString);
                    list.remove(secondString);
                    tr = true;
                    break;
                } else {
                    j++;
                }
            }
            if (!tr){
                i++;
            }
        }
        for (Pair pair : result) {
            System.out.println(pair);
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair(){}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}






























