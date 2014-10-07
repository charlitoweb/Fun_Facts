package com.example.charlito.funfacts;

import java.util.Random;

/**
 * Created by Charlito on 22/09/2014.
 */
public class FactBook {

    //Variables
    String facts [] = {"Ants stretch when they wake up in the morning",
            "Ostriches can run faster than horses",
            "Olympic gold medals are actually"};

    //Metodos
    public String getFact(){

        // Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new numberGenerator
        int randomNumber = randomGenerator.nextInt(facts.length);
        String  fact;
        fact = facts[randomNumber];
        return fact;
    }
}
