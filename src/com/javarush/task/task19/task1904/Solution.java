package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            char[] personToChar = fileScanner.nextLine().toCharArray();
            ArrayList <Character> firstNameToChar = new ArrayList<>();
            ArrayList <Character> lastNameToChar = new ArrayList<>();
            ArrayList <Character> middleNameToChar = new ArrayList<>();
            ArrayList <Character> birthDateToChar = new ArrayList<>();
            int sw = 0;
            for(char c : personToChar){
                if (c == ' ') sw++;
                else {
                    if (sw == 0) lastNameToChar.add(c);
                    else if (sw == 1) firstNameToChar.add(c);
                    else if (sw == 2) middleNameToChar.add(c);
                    else if (sw > 2) birthDateToChar.add(c);
                }
            }
            String firstName = charToString(firstNameToChar);
            String lastName = charToString(lastNameToChar);
            String middleName = charToString(middleNameToChar);
            String birthDateText = charToString(birthDateToChar);
            SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
            Date birthDate = df.parse(birthDateText);

            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }

    public static String charToString (ArrayList<Character> list){
        StringBuilder sb = new StringBuilder();
        for (char c : list){
            sb.append(c);
        }
        return sb.toString();
    }
}





























