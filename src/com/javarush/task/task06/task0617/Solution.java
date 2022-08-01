package com.javarush.task.task06.task0617;

/*
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        Idea idea = new Idea();
        idea.description = "Стать программистом";
        printIdea(idea);


    }

    public static class Idea{
        String description;
        public String getDascription(){
            return description;
        }
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDascription());
    }//напишите тут ваш код
}