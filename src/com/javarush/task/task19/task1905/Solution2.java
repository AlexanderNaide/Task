package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Закрепляем адаптер
*/

public class Solution2 {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        Company company = new Company();
        Person person = new Person();
        DataAdapter adapter = new DataAdapter(company, person);
        System.out.println(adapter.getCountryCode());
        System.out.println(adapter.getCompany());
        System.out.println(adapter.getContactFirstName());
        System.out.println(adapter.getContactLastName());
        System.out.println(adapter.getDialString());


    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String code = customer.getCountryName();
            String countryName = null;
            for (Map.Entry<String, String> entry : countries.entrySet()){
                if (entry.getValue().equals(code)){
                    countryName = entry.getKey();
                    break;
                }
            }
            return countryName;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            Scanner sc = new Scanner(contact.getName());
            sc.useDelimiter(", ");
            String lastName = sc.next();
            String firstName = sc.next();

            return firstName;
        }

        @Override
        public String getContactLastName() {
            Scanner sc = new Scanner(contact.getName());
            sc.useDelimiter(", ");

            return sc.next();
        }

        @Override
        public String getDialString() {
            StringBuilder sb = new StringBuilder();
            sb.append("callto://+");
            String st = contact.getPhoneNumber();
            char[] c = contact.getPhoneNumber().toCharArray();
            for (char x : c){
                try {
                    sb.append(Integer.parseInt(String.valueOf(x)));
                } catch (NumberFormatException ignored){}
            }
            return sb.toString();
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto:
                                                    // +380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
    public static class Company implements Customer {
        @Override
        public String getCompanyName() {
            return "JavaRush Ltd.";
        }

        @Override
        public String getCountryName() {
            return "Ukraine";
        }
    }
    public static class Person implements Contact {

        @Override
        public String getName() {
            return "Ivanov, Ivan";
        }

        @Override
        public String getPhoneNumber() {
            return "+38(050)123-45-67";
        }
    }
}





























