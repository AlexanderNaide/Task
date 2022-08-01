package com.javarush.task.jdk13.task05.task0500;

public class Solution {

    public static String getMashin(int count){
        String a = "машина";                      // Одна...
        String b = "машин";                       // Несколько...
        String c = "машины";                      // Две...

        String o;
        int i;

        if (count > 99){
            char [] s = (count + "").toCharArray();
            char d = s[s.length - 2];
            char e = s[s.length - 1];

            i = Integer.parseInt(String.valueOf (d) + (e));
        }
        else i = count;

        if (i < 10){
            if(i == 1) o = a;
            else if (i > 1 && i < 5) o = c;
            else o = b;
        }
        else {
            if (i < 20) o = b;
            else {
                i = i % 10;
                if(i == 1) o = a;
                else if (i > 1 && i < 5) o = c;
                else o = b;
            }

        }

        return o;
    }

    public static void main(String[] args) {
        int count = 90;

        while (count < 120){
            System.out.println();
            System.out.println();
            System.out.println("На фабрике произведено " + count + " " + getMashin(count) + ".");
            count++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
