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
		boolean foundPastry = false;
		for (Integer key : mMapPastry.keySet()) {
			List<Pastry> pList = mMapPastry.get(key);
			if (pList.contains(pastry) && rating != key) {
				pList.remove(pastry);
				List<Pastry> newPList = mMapPastry.get(rating);
				newPList.add(pastry);
				mMapPastry.put(rating, newPList);
			return;
			}
			else if (pList.contains(pastry)) {
				foundPastry = true;
			}
			if (!foundPastry) {
				List<Pastry> listP = mMapPastry.get(rating);
				if (listP == null) {
					listP = new ArrayList<Pastry>();
					listP.add(pastry);
					mMapPastry.put(rating, listP);
				}
			}
		}
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
		for (Integer key : mMapPastry.keySet()) {
			List<Pastry> pList = mMapPastry.get(key);
			if (pList.contains(pastry)) {
				return pList.remove(pastry);
			}
		}
		return false;
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
		for (Integer key : mMapPastry.keySet()) {
			List<Pastry> pList = mMapPastry.get(key);
			if (mMapPastry.containsKey(pastry)) {
				return key;
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
		List<Pastry> pList = mMapPastry.get(rating);
		if (pList == null)
			pList = new ArrayList<Pastry>();
		Set<Pastry> sPastry = new HashSet<Pastry>(pList);
		return sPastry;
	}
}
