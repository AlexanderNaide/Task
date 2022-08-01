package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread(new infinity()));
        threads.add(new Thread(new except()));
        threads.add(new Thread(new ura()));
        threads.add(new message());
        threads.add(new Thread(new read()));
    }

    public static void main(String[] args) {

    }

    public static class infinity implements Runnable{
        @Override
        public void run() {
            while(true){
                int a = 1 + 1;
            }
        }
    }

    public static class except implements Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class ura implements Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class message extends Thread implements Message{
        private boolean warning = true;
        public void showWarning() {
            warning = false;
        }

        public void run() {
            while (warning){
            }
        }
    }

    public static class read  implements Runnable {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = 0;
            try {
                String b = reader.readLine();
                while (!b.equals("N")){
                    a = a + Integer.parseInt(b);
                    b = reader.readLine();
                }
                System.out.println(a);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}





























