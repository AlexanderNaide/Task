package com.javarush.task.task19.task1904;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Solution2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner("Иванов Иван Иванович 31 12 1950");
        char[] personToChar = sc.nextLine().toCharArray();
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
        System.out.println(birthDateToChar);

        String firstName = charToString(firstNameToChar);
        String lastName = charToString(lastNameToChar);
        String middleName = charToString(middleNameToChar);
        String birthDateText = charToString(birthDateToChar);
        SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
        Date birthDate = df.parse(birthDateText);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(middleName);
        System.out.println(birthDate);

        Person p = new Person(firstName, middleName, lastName, birthDate);
        System.out.println(p);
    }

    public static String charToString (ArrayList<Character> list){
        StringBuilder sb = new StringBuilder();
        for (char c : list){
            sb.append(c);
        }
        return sb.toString();
    }
}
