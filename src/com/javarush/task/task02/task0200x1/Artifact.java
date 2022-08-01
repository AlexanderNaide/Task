package com.javarush.task.task02.task0200x1;


public class Artifact {
    int id;
    String culture;
    int century;

    public Artifact(int id){
        this.id = id;
    }
    public Artifact(int id, String culture){
        this.id = id;
        this.culture = culture;
    }
    public Artifact(int id, String culture, int century){
        this.id = id;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact lot1 = new Artifact(202054);
        Artifact lot2 = new Artifact(202055, "Ацтеки");
        Artifact lot3 = new Artifact(202056, "Китай", 9);
    }
}