package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;

	/*
	 * PopSong
	 *
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and number of weeks on billboard
	 */
	 PopSong() {
	 	super();
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first PopSong constructor
	/************************************************/

	/*
	 * PopSong
	 * 
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	 PopSong(Ensemble ensemble, String title) {
		 mEnsemble = ensemble;
		 mTitle = title;
		 mYearReleased = 0;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second PopSong constructor
	/************************************************/

	/*
	 * PopSong
	 *
	 * Side-effects: Sets the weeks on billboard to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	 PopSong(Ensemble ensemble, String title, int yearReleased) {
		 mEnsemble = ensemble;
		 mTitle = title;
		 mYearReleased = yearReleased;
		 mWeeksOnBillboard = 0;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third PopSong constructor
	/************************************************/

	/*
	 * PopSong
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100 (int)
	 */
	 PopSong(Ensemble ensemble, String title, int yearReleased, int weeksOnBillboard) {
		 mEnsemble = ensemble;
		 mTitle = title;
		 mYearReleased = yearReleased;
		 mWeeksOnBillboard = weeksOnBillboard;
	 }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the fourth PopSong constructor
	/************************************************/
}
