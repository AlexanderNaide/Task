package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        switch (args[0]){
            case "-c" :
                DateFormat rf = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
                synchronized (allPeople) {
                    for (int i = 0; i < ((args.length - 1) / 3); i++) {
                        int y = 1 + (i * 3);
                        String name = args[y];
                        String sex = args[y + 1];
                        Date birthDate = rf.parse(args[y + 2]);
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
                }
                break;

            case "-u" :
                DateFormat rt = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
                synchronized (allPeople) {
                    for (int i = 0; i < ((args.length - 1) / 4); i++) {
                        int y = 1 + (i * 4);
                        Person person = allPeople.get(Integer.parseInt(args[y]));
                        person.setName(args[y + 1]);
                        person.setSex(args[y + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                        person.setBirthDate(rt.parse(args[y + 3]));
                    }
                }
                break;

            case "-d" :
                synchronized (allPeople) {
                    for (int i = 0; i < (args.length - 1); i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i + 1]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;

            case "-i" :
                DateFormat df = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);
                synchronized (allPeople) {
                    for (int i = 0; i < (args.length - 1); i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i + 1]));
                        String name = person.getName();
                        String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                        String date = df.format(person.getBirthDate());
                        System.out.println(name + " " + sex + " " + date);
                    }
                }
                break;
        }//start here - начни тут
    }
}






























