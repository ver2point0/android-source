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
        int magicNumber = WorstPractices.animals(false);
        magicNumber *= 5;
        if (magicNumber > 18) {
            while(magicNumber > 0)    {
                magicNumber--;
            }
       }
    }

    /**
     * animals()
     * this method takes in a single parameter, booleanSeed.
     * Using a very elaborate and complex algorithm, it calculates a magic number
     * booleanSeed: a seed which helps generate the magic number and returns a magic number
    **/
    private static int animals(boolean booleanSeed) {

        int aInt = booleanSeed ? 34 : 21;
        float sparklesFairy = .5f;
        for (int brown = 0; brown < aInt; brown++) { 
            sparklesFairy *= aInt;
        } 
        return (int) sparklesFairy * aInt;
    }

    /************************************************
     *    ASSIGNMENT
     *    Fix code and comments above this block
    /************************************************/
}
