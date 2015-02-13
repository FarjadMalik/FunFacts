package com.example.farjad.team.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by HP on 2/12/2015.
 */
public class ColorWheel {
    //Member Variables (properties of the class)
    private String[] mColor = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
             };
    // Methods (abilities : things the object can do)
    public int getColor(){

        // Randomly generate a fact
        Random randomGenerator = new Random(); // construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColor.length);

        int colorAsInt = Color.parseColor(mColor[randomNumber]);
        return colorAsInt;
    }
}
