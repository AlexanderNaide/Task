package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Читаем и пишем в файл: JavaRush
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
            //File yourFile = File.createTempFile("your_file_name", null);
            File yourFile = new File("C:\\kn\\text2.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();

            User grishka = new User();
            grishka.setFirstName("Григорий");
            grishka.setLastName("Войчук");
            SimpleDateFormat df = new SimpleDateFormat("dd MM yyyy");
            grishka.setBirthDate(df.parse("15 09 1985"));
            grishka.setMale(true);
            grishka.setCountry(User.Country.RUSSIA);
            javaRush.users.add(grishka);

            User mashka = new User();
            mashka.setFirstName("Мария");
            mashka.setLastName("Самойлова");
            mashka.setBirthDate(df.parse("31 03 1991"));
            mashka.setMale(false);
            mashka.setCountry(User.Country.RUSSIA);
            javaRush.users.add(mashka);


            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(javaRush.equals(loadedObject));

            for (User u : javaRush.users){
                System.out.printf("%s, с фамилией %s из %s \r\n", u.getFirstName(), u.getLastName(), u.getCountry().getDisplayName());
            }

            for (User u : loadedObject.users){
                System.out.printf("%s, с фамилией %s из %s \r\n", u.getFirstName(), u.getLastName(), u.getCountry().getDisplayName());
            }

            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();


    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintStream p = new PrintStream(outputStream);
            if(!users.isEmpty()){
                for(User u : users){
                    p.println(u.getFirstName());
                    p.println(u.getLastName());
                    p.println(u.getBirthDate().getTime());
                    p.println(u.isMale());
                    p.println(u.getCountry());
                }
            }
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
            ArrayList<String> list = new ArrayList<>();
            while (r.ready()){
                list.add(r.readLine());
            }
            if (!list.isEmpty()) {
                for (int i = 0; i < (list.size() / 5); i++) {
                    User u = new User();

                    u.setFirstName(list.get(i*5));
                        System.out.println(list.get(i*5));
                    u.setLastName(list.get(i*5+1));
                        System.out.println(list.get(i*5+1));
                    u.setBirthDate(new Date(Long.parseLong(list.get(i*5+2))));
                        System.out.println(list.get(i*5+2));
                    u.setMale(Boolean.parseBoolean(list.get(i*5+3)));
                        System.out.println(list.get(i*5+3));
                    u.setCountry(User.Country.valueOf(list.get(i*5+4)));
                        System.out.println(list.get(i*5+4));
                    this.users.add(u);
                }
            }

            //implement this method - реализуйте этот метод
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}






























