package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

	/************************************************
	 *	ASSIGNMENT:
	 *	Fix code and comments below this block
	/************************************************/

	public static void main(String [] args) {
	final int MAGIC_NUMBER = WorstPractices.animals(false);
	MAGIC_NUMBER *= 5;
		if (MAGIC_NUMBER > 18) {
			while(MAGIC_NUMBER > 0) {
				MAGIC_NUMBER--;
			}
		}
	}
	
	/*
	animals()
	this method takes in a single parameter, booleanSeed, and calculates a magic number
	booleanSeed: a seed which helps generate the magic number
	returns: sparklesFairy * aInt
	*/
	
	private static int animals(boolean booleanSeed) {
		int aInt = booleanSeed ? 34 : 21;
		float sparklesFairy = .5f;
		for (int brown = 0; brown < aInt; brown++) { 
			sparklesFairy *= aInt;
		} 
		return (int) sparklesFairy * aInt;
	}

	/************************************************
	 *	ASSIGNMENT
	 *	Fix code and comments above this block
	/************************************************/
}
