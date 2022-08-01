package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

/*
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        if ((args.length != 0) && (args[0].equals("-u"))){
            LinkedList<String> table = new LinkedList<>();
            BufferedReader readerFile = new BufferedReader(new FileReader(name));
            while (readerFile.ready()){
                table.add(readerFile.readLine());
            }
            readerFile.close();
            int id = Integer.parseInt(args[1]);
            for (String line : table){
                char[] a = line.toCharArray();
                char[] b = Arrays.copyOfRange(a, 0, 8);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 8; i++) {
                    if (a[i] != ' ')sb.append(a[i]);
                }
                int searshId = Integer.parseInt(sb.toString());
                if (searshId == id){
                    char[] c = args[2].toCharArray();
                    char[] d = args[3].toCharArray();
                    char[] e = args[4].toCharArray();
                    Arrays.fill(a, ' ');
                    System.arraycopy(b, 0, a, 0, b.length);
                    System.arraycopy(c, 0, a, 8, c.length);
                    System.arraycopy(d, 0, a, 38, d.length);
                    System.arraycopy(e, 0, a, 46, e.length);
                    int index = table.indexOf(line);
                    String lineNew = new String(a);
                    table.remove(index);
                    table.add(index, lineNew);
                    break;
                }
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));
            for (String lineResult : table){
                writer.write(lineResult + "\n");
            }
            writer.flush();
            writer.close();
        }
        if ((args.length != 0) && (args[0].equals("-d"))){
            LinkedList<String> table = new LinkedList<>();
            BufferedReader readerFile = new BufferedReader(new FileReader(name));
            while (readerFile.ready()){
                table.add(readerFile.readLine());
            }
            readerFile.close();
            int id = Integer.parseInt(args[1]);
            for (String line : table){
                char[] a = line.toCharArray();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 8; i++) {
                    if (a[i] != ' ')sb.append(a[i]);
                }
                int searshId = Integer.parseInt(sb.toString());
                if (searshId == id){
                    table.remove(line);
                    break;
                }
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));
            for (String lineResult : table){
                writer.write(lineResult + "\n");
            }
            writer.flush();
            writer.close();
        }
    }
}






























