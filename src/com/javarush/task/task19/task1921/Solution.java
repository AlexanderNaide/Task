package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready()){
            String[] readString = reader.readLine().split(" ");
            String name = null;
            String date = readString[readString.length-3] + " " + readString[readString.length-2] + " " + readString[readString.length-1];
            for (int i = 0; i < readString.length-3; i++){
                if (name != null) name = name + " " + readString[i];
                else name = readString[i];
            }
            DateFormat df = new SimpleDateFormat("dd M yyyy");
            Date birdDate = df.parse(date);
            PEOPLE.add(new Person(name, birdDate));
        }

        reader.close();
    }
}





























