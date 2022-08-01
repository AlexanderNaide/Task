package com.javarush.task.task18.task1826;

import java.io.*;

/*
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("-e")){
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(args[1]));
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(args[2]));
            int i;
            while ((i = reader.read())!=-1){
                i += 236;
                writer.write(i);
            }
            writer.flush();
            reader.close();
            writer.close();
        }
        if (args[0].equals("-d")){
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(args[1]));
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(args[2]));
            int i;
            while ((i = reader.read())!=-1){
                i -= 236;
                writer.write(i);
            }
            writer.flush();
            reader.close();
            writer.close();
        }
    }
}






























