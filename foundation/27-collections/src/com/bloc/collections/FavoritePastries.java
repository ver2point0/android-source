package com.bloc.collections;

import java.util.*;

/*
 * FavoritePastries
 * 
 * This class maintains a record of Pastry objects and their
 * relation to a 1 to 5 rating scale.
 *
 * For example:
 * 5 Star Pastries: Cronut, Cherry Pie
 * 4 Star Pastries: Strudel, Apple Pie
 * 3 Star Pastries: Bear Claw
 * 2 Star Pastries: Pop-Tart
 * 1 Star Pastries: Pot Pie
 *
 * A pastry may not have duplicate entries
 */
public class FavoritePastries {

	/************************************************
 	 *	ASSIGNMENT:
	 *	Use a HashMap to store the relationship
	 *	between rating and pastry: HashMap<Integer, List<Pastry>>
	/************************************************/
	private HashMap<Integer, List<Pastry>> mMapPastry;

	public FavoritePastries() {
		mMapPastry = new HashMap<Integer, List<Pastry>>();
	}

	/* 
	 * addPastry
	 *
	 * Add a Pastry to the FavoritePastries class.
	 *
	 * This method stores this Pastry and its
	 * associated rating in some sort of data structure.
	 *
	 * If this Pastry already exists in FavoritePastries,
	 * its old rating should be updated.
	 *
	 * @param pastry The Pastry to store
	 * @param rating The rating to associate with it
	 * @return nothing
	 */
	public void addPastry(Pastry pastry, int rating) {
		List<Pastry> tPastry = mMapPastry.get(rating);
		mMapPastry.put(rating, tPastry);
	}

	/* 
	 * removePastry
	 *
	 * Remove a Pastry from FavoritePastries
	 *
	 * This method removes any reference to this exact
	 * Pastry object and its associated rating
	 *
	 * @param pastry The Pastry to remove
	 * @return true if the Pastry was found and removed,
	 *		   false otherwise
	 */
	public boolean removePastry(Pastry pastry) {
		List<Pastry> tPastry = mMapPastry.get(pastry);
		if (tPastry != null) {
			tPastry = mMapPastry.remove(pastry);
			return true;
		}
		else {
			return false;
		}
	}

	/* 
	 * getRatingForPastry
	 *
	 * Return the associated rating for a given Pastry
	 *
	 * This method will find the associated rating for
	 * this Pastry inside of FavoritePastries and return
	 * it to its caller.
	 *
	 * @param  pastry The Pastry for which a rating must
	 * 		   be recovered
	 * @return the rating associated with this Pastry or
	 *		   -1 if not found among FavoritePastries
	 */
	public int getRatingForPastry(Pastry pastry) {
		Set pastrySet = (Set) mMapPastry.entrySet();
		Iterator<?> iMap = pastrySet.iterator();
		while (iMap.hasNext()) {
			Map.Entry map = (Map.Entry) iMap.next();
			Integer kValue = (Integer) map.getKey();
			Pastry pValue = (Pastry) map.getValue();
			if (pastry == pValue) {
				return  kValue;
			}
		}
		return -1;
	}

	/* 
	 * getPastriesForRating
	 *
	 * Return a Set of all the Pastries with a given
	 * rating.
	 *
	 * This method returns a Set<Pastry> object containing
	 * references to all of the Pastries associated with
	 * a particular rating.
	 *
	 * @param  rating The rating of the Pastry objects the
	 *		   caller wishes to recover
	 * @return A Set of all the Pastry objects with a rating
	 * 		   of `rating`. Returns an empty set if none are
	 *         found
	 */
	public Collection<Pastry> getPastriesForRating(int rating) {
		Set pastrySet = (Set) mMapPastry.entrySet();
		Iterator<?> iMap = pastrySet.iterator();
		while (iMap.hasNext()) {
			Map.Entry map = (Map.Entry) iMap.next();
			Integer kValue = (Integer) map.getKey();
			if (kValue == rating) {
				Set kSet = mMapPastry.keySet();
				return  kSet;
			}
		}
		Set<Pastry> eSet = Collections.emptySet();
		return eSet;
	}

}
