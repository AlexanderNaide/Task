package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

/*
C:\kn\text2.txt
C:\kn\text3.txt
 */

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();
        ArrayList<String> file1 = new ArrayList<>();
        ArrayList<String> file2 = new ArrayList<>();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader reader2 = new BufferedReader(new FileReader(fileName2));
        while (reader1.ready()){
            file1.add(reader1.readLine());
        }
        reader1.close();
        while (reader2.ready()){
            file2.add(reader2.readLine());
        }
        reader2.close();
        while (!(file1.size() == 0 && file2.size() == 0)){
            String line1;
            String line2;

            if (file1.isEmpty()) line1 = null;
            else line1 = file1.get(0);
            if (file2.isEmpty()) line2 = null;
            else line2 = file2.get(0);

            if (line1 == null){
                lines.add(new LineItem(Type.ADDED, line2));
                file2.remove(line2);
            }
            else if (line2 == null){
                lines.add(new LineItem(Type.REMOVED, line1));
                file1.remove(line1);
            }
            else if (line1.equals(line2)){
                lines.add(new LineItem(Type.SAME, line1));
                file1.remove(line1);
                file2.remove(line1);
            }
            else{
                String line3 = file2.get(1);
                if (line1.equals(line3)){
                    lines.add(new LineItem(Type.ADDED, line2));
                    file2.remove(line2);
                    lines.add(new LineItem(Type.SAME, line1));
                    file1.remove(line1);
                    file2.remove(line1);
                }
                else {
                    lines.add(new LineItem(Type.REMOVED, line1));
                    file1.remove(line1);
                }
            }
        }
/*
        for (LineItem t : lines){
            System.out.println(t.type + ": " + t.line);
        }

 */
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}






























