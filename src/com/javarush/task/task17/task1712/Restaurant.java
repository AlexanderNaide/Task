package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;

/*
Ресторан
*/


/*
*
*
*
*
*
*
*
* ЗАДАЧА РЕШЕНА!!!!!
* для сдачи скопировать код класса Cook
* там изменения в 1 строчке, остальное в программе не менялась
*
*
*
*
*
*
*
*
*/

public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter();
        Thread waiter = new Thread(waiterTarget);
        threads.add(waiter);

        Cook cookTarget = new Cook();
        Thread cook = new Thread(cookTarget);
        threads.add(cook);

        waiter.start();
        cook.start();

        Thread.sleep(2000);
        cookTarget.continueWorking = false;
        Thread.sleep(500);
        waiterTarget.continueWorking = false;
    }
}





























