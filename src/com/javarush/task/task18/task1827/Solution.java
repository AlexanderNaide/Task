package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*
Прайсы
*/

//C:\text.txt

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        if ((args.length != 0) && (args[0].equals("-c"))){
            char[] a = (((readID(name) + 1) + "").toCharArray());
            char[] b = args[1].toCharArray();
            char[] c = args[2].toCharArray();
            char[] d = args[3].toCharArray();
            char[] result = new char[50];
            Arrays.fill(result, ' ');
            System.arraycopy(a, 0, result, 0, a.length);
            System.arraycopy(b, 0, result, 8, b.length);
            System.arraycopy(c, 0, result, 38, c.length);
            System.arraycopy(d, 0, result, 46, d.length);

            BufferedWriter writer = new BufferedWriter(new FileWriter(name, true));
            writer.write("\r\n");
            writer.write(result);
            writer.close();
        }
    }
    public static int readID(String name) throws IOException {
        int id = 0;
        BufferedReader reader = new BufferedReader(new FileReader(name));
        ArrayList<Integer> list = new ArrayList<>();

        while (reader.ready()){
            String s = reader.readLine();
            char[] a = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                if (a[i] != ' ')sb.append(a[i]);
            }
            int x = Integer.parseInt(sb.toString());
            list.add(x);
            for (int i : list){
                id = Math.max(id, i);
            }
        }
        reader.close();
        return id;
    }
}






























