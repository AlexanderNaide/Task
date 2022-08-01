package com.javarush.task.task20.task2015;

import java.io.*;

/*
Переопределение сериализации
*/

public class Solution implements Serializable, Runnable{

    private static final long serialVersionUID = 1L;

    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        for (int i = 0; i <= speed; ) {
            System.out.println("Speed = " + i);
            i += 10;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Speed maximum!");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = speed - 10; i >= 0; ) {
            System.out.println("Speed = " + i);
            i -= 10;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("!!!!!!!!! F I N I S H !!!!!!!!!!");
    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runner = new Thread(this);
        runner.start();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        File f = new File("C:\\kn\\text2.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));

        Solution tolik = new Solution(60);
        tolik.runner.join();

        out.writeObject(tolik);

        Solution kto = (Solution) in.readObject();

        tolik = (Solution) in.readObject();
        out.close();
        in.close();
    }
}






























