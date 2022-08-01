package com.javarush.task.jdk13.task05.task0500;

public class Car {

    String name;
    int price;
    int maxSpeed;

    public Car (String name, int price, int maxSpeed){
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString(){
        return String.format("Это машина %s , едет она %d и стоит %d", name, maxSpeed, price);
    }

    public static void main(String[] args) {
        String carName = "Zgigul";
        int carPrica = 30000;
        int carSpeed = 90;

        Car zgigul = new Car(carName, carPrica, carSpeed);

        System.out.println(zgigul);

    }
}
