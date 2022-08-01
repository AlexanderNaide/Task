package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Serializable Solution
*/

public class Solution implements Serializable{
    public static void main(String[] args){
        try {
            System.out.println(new Solution(4));

            File file = new File("C:\\kn\\text7.txt");
            FileOutputStream fileOutput = new FileOutputStream(file);
            FileInputStream fileInput = new FileInputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOutput);
            ObjectInputStream in = new ObjectInputStream(fileInput);
            Solution savedObject = new Solution(33);
            out.writeObject(savedObject);
            Solution newObject = new Solution(30);
            Solution loadedObject = (Solution) in.readObject();
            System.out.println(savedObject);
            System.out.println(loadedObject);
            System.out.println(newObject);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}






























