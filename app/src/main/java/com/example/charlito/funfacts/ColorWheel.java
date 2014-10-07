package com.example.charlito.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Charlito on 22/09/2014.
 */
public class ColorWheel {


    //Variables
    String mColor [] = {"#39add1","#3079ab","#c25975"};

    //Metodos
    public int getColor(){

        // Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new numberGenerator
        int randomNumber = randomGenerator.nextInt(mColor.length);
        int  color = Color.parseColor(mColor[randomNumber]);
        return color;
    }
}
