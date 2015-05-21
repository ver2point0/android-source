package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Song
	 *
	 * Defailt Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	 Song() {
	 	Artist[] artistArray = new Artist[1];
		Artist artist = new Artist("J", "P");
		artistArray[0] = artist;
		mEnsemble = new Ensemble(artistArray);
		mTitle = "Artist 2048";
		mYearReleased = 2100;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Song constructor
	/************************************************/

	/*
	 * Song
	 *
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	 Song(Ensemble ensemble, String title) {
		 mEnsemble = ensemble;
		 mTitle = title;
		 mYearReleased = 0;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Song constructor
	/************************************************/

	/*
	 * Song
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	 Song(Ensemble ensemble, String title, int yearReleased) {
		 mEnsemble = ensemble;
		 mTitle = title;
		 mYearReleased = yearReleased;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third Song constructor
	/************************************************/
}