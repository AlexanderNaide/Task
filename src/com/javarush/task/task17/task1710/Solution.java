package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        if (args[0].equals("-c")){
            String name = args[1];
            String sex = args[2];
            DateFormat rf = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
            Date birthDate = rf.parse(args[3]);
            Person person;
            if (sex.equals("м")) {
                person = Person.createMale(name, birthDate);
            } else {
                person = Person.createFemale(name, birthDate);
            }
            allPeople.add(person);
            int id = allPeople.indexOf(person);

            System.out.println(id);
        }

        if (args[0].equals("-u")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
            DateFormat rf = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
            person.setBirthDate(rf.parse(args[4]));
        }

        if (args[0].equals("-d")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }

        if (args[0].equals("-i")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String name = person.getName();
            String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
            DateFormat df = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);
            String date = df.format(person.getBirthDate());

            System.out.println(name + " " + sex + " " + date);
        }
    }
}






























