package com.javarush.task.task19.task1903;

/*
Адаптация нескольких интерфейсов
*/

import java.util.*;

public class Solution2 {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        Incomen inc = new Incomen();
        IncomeDataAdapter adapter = new IncomeDataAdapter(inc);
        System.out.println(adapter.getPhoneNumber());

    }

    public static class Incomen implements IncomeData{
        @Override
        public String getCountryCode() {
            return null;
        }

        @Override
        public String getCompany() {
            return null;
        }

        @Override
        public String getContactFirstName() {
            return null;
        }

        @Override
        public String getContactLastName() {
            return null;
        }

        @Override
        public int getCountryPhoneCode() {
            return 38;
        }

        @Override
        public int getPhoneNumber() {
            return 501234567;
        }
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData incomeData;
        public IncomeDataAdapter(IncomeData incomeData){
            this.incomeData = incomeData;
        }

        @Override
        public String getCompanyName() {
            return incomeData.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(incomeData.getCountryCode());
        }

        @Override
        public String getName() {
            return incomeData.getContactLastName() + ", " + incomeData.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            char[] codeToChar = (incomeData.getCountryPhoneCode() + "").toCharArray();
            System.out.println(codeToChar);
            char[] numberToChar = (incomeData.getPhoneNumber() + "").toCharArray();
            System.out.println(numberToChar);
            StringBuilder sb = new StringBuilder();
            char[] resultNumber = new char[10];
            for (int i = resultNumber.length; i > 0; i--){
                int j = i - ((resultNumber.length - numberToChar.length) + 1);
                if (j < 0) resultNumber[i-1] = '0';
                else resultNumber[i-1] = numberToChar[j];
                System.out.println(resultNumber[i-1]);
            }
            System.out.println(resultNumber);
            sb.append('+');
            for (char c : codeToChar){
                sb.append(c);
            }
            sb.append('(');
            sb.append(resultNumber[0]);
            sb.append(resultNumber[1]);
            sb.append(resultNumber[2]);
            sb.append(')');
            sb.append(resultNumber[3]);
            sb.append(resultNumber[4]);
            sb.append(resultNumber[5]);
            sb.append('-');
            sb.append(resultNumber[6]);
            sb.append(resultNumber[7]);
            sb.append('-');
            sb.append(resultNumber[8]);
            sb.append(resultNumber[9]);

            return sb.toString();
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}





























