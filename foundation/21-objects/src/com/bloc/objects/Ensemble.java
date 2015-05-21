package com.bloc.objects;

class Ensemble extends Object {
	// Name
	String mName;

	// All of the artists in the group
	Artist[] mArtists;

	/*
	 * Ensemble
	 *
	 * This constructor takes in a variable length of Artist objects
	 *
	 * @param artists variable length artists (Artist... artists)
	 */
	 Ensemble(Artist[] artists) {
		mArtists = artists;
		mName = artists[0].mFirstName + artists[0].mLastName;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Ensemble constructor
	/************************************************/

	/*
	 * Ensemble
	 *
	 * This constructor takes a name and a variable length of Artist objects
	 * Side-effect: if the 'name' parameter is null, uses the first and
	 * 				last name of the first Artist
	 * Hint:		You can add Strings together with a '+'
	 *
	 * @param name the name of the group (String)
	 * @param artists variable length artists (Artist... artists)
	 */
	 Ensemble(String name, Artist[] artists) {
		 if (name == null) {
			name = artists[0].mFirstName + artists[0].mLastName;	
		 }
		 mName = name;
		 mArtists = artists;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Ensemble constructor
	/************************************************/
}