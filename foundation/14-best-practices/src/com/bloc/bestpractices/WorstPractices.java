package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

    /************************************************
     *    ASSIGNMENT:
     *    Fix code and comments below this block
    /************************************************/

    public static void main(String [] args) {
        int magicNumber = WorstPractices.getMagicNumber(false);
        magicNumber *= 5;
        if (magicNumber > 18) {
            magicNumber = 0;
       }
    }

    /**
     * getMagicNumber()
     * this method takes in a single parameter, booleanSeed.
     * Using a very elaborate and complex algorithm, it calculates a magic number
     * booleanSeed: a seed which helps generate the magic number and returns a magic number
    **/
    private static int getMagicNumber(boolean booleanSeed) {

        int booleanMultiplier = booleanSeed ? 34 : 21;
        float startNum = .5f;
        for (int i = 0; i < booleanMultiplier; i++) { 
            startNum *= booleanMultiplier;
        } 
        return (int) startNum * booleanMultiplier;
    }

    /************************************************
     *    ASSIGNMENT
     *    Fix code and comments above this block
    /************************************************/
}
