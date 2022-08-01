package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
           Solution.readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet(){
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String planetName = null;
        try {
            planetName = reader.readLine();
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        if (planetName.equals(Planet.SUN)) {
            Solution.thePlanet = Sun.getInstance();
        }
        else if (planetName.equals(Planet.MOON)) {
            Solution.thePlanet = Moon.getInstance();
        }
        else if (planetName.equals(Planet.EARTH)) {
            Solution.thePlanet = Earth.getInstance();
        }
        else
            Solution.thePlanet = null;
    }
}






























