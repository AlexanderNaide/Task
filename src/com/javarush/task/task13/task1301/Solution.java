package com.javarush.task.task13.task1301;

/*
Пиво
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker { //Пьющий
        void askForMore(String message); //Попросить еще

        void sayThankYou(); // Сказать спасибо

        boolean isReadyToGoHome(); //Готов идти домой
    }

    public interface Alcoholic extends Drinker { //Алкоголик
        boolean READY_TO_GO_HOME = false; //Готов идти домой

        void sleepOnTheFloor(); //Спать на полу
    }

    public static class BeerLover implements Alcoholic{
        public void askForMore(String message){

        }
        public void sayThankYou(){

        }
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }
        public boolean READY_TO_GO_HOME = false;
        public void sleepOnTheFloor(){

        }
    }
}