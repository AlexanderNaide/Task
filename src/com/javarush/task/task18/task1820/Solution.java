package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;

/*
Округление чисел
*/
/*
C:\text.txt
C:\text1.txt
 */

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFileRead = reader.readLine();
        String nameFileWrite = reader.readLine();
        reader = new BufferedReader(new FileReader(nameFileRead));
        BufferedWriter writer = new BufferedWriter(new FileWriter(nameFileWrite));
        char[] c = reader.readLine().toCharArray();
        ArrayList<Character> c2 = new ArrayList<>();
        for (int i = 0; i < c.length; i++){
            if (c[i] == ' ') {
                double x = Double.parseDouble(StringOfChar(c2));
                c2.clear();
                writer.write((int)Math.round(x) + " ");
            }
            else if (i == c.length-1){
                c2.add(c[i]);
                double x = Double.parseDouble(StringOfChar(c2));
                c2.clear();
                writer.write((int)Math.round(x) + "");
            }
            else{
                c2.add(c[i]);
            }
        }
        writer.flush();
        reader.close();
        writer.close();

    }
    public static String StringOfChar(ArrayList<Character> x){
        StringBuilder sb = new StringBuilder();
        for (char c : x){
            sb.append(c);
        }
        return sb.toString();
    }
}






























