package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;

    private List<Horse> horses;

    public List getHorses (){

        return horses;
    }

    public Hippodrome (List list){

        this.horses = list;
    }

    public void move(){
        for (Horse h : horses){
            h.move();
        }

    }
    public void print(){

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        for (Horse h : horses){
            h.print();
        }
    }

    public Horse getWinner(){
        Horse winner = horses.get(0);
        if (horses.size()>1){
            for (int i = 1; i < horses.size(); i++) {
                if (horses.get(i).distance > winner.distance) winner = horses.get(i);
            }
        }
        return winner;
    }

    public void printWinner (){
        System.out.println("Winner is " + getWinner().name + "!");
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {

        ArrayList <Horse> list = new ArrayList<>();
        list.add(new Horse("Malvina", 3.0, 0.0));
        list.add(new Horse("Herakl", 3.0, 0.0));
        list.add(new Horse("Speedy", 3.0, 0.0));
        list.add(new Horse("Hamlet", 3.4, 0.0));


        game = new Hippodrome(list);

        game.run();

        game.printWinner();

    }
}





























