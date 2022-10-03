package org.howard.edu.lsp.assignment4.implementation;

import java.util.List;
import java.util.ArrayList;

/**
 * Farouk Balogun
 * 
 * @author olaol
 */

/**
 * An unordered collection of unique integers.
 */
public class IntegerSet {
	/**
	 * Internal structure to store the elements of the set.
	 * The set is stored as an ArrayList<Integer> object.
	 */
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default constructor for the set.
	 * The set starts out empty (without any elements).
	 */
	public IntegerSet() {
		this.set = new ArrayList<Integer>();
	}
	
	/**
	 * This method clears the internal representation of the set, leaving it empty.
	 */
	public void clear() {
		this.set.clear();
	}
	
	/**
	 * This method returns the length of the set.
	 * @return the number of elements in the set.
	 */
	public int length() {
		return this.set.size();
	}
	
	/**
	 * This method returns true if the 2 sets are equal.
	 * It returns false otherwise.
	 * Two sets are equal if they contain all of the same values in any order.
	 * @param b The second IntegerSet being compared with.
	 * @return true if the set is equal to b, else false.
	 */
	public boolean equals(IntegerSet b) {
		if (this.set.size() != b.length()) {
			return false;
		} 
		for (int i=0; i < this.set.size(); i++) {
			if (!b.contains(this.set.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * This method returns true if the set contains the specified value.
	 * It returns false otherwise.
	 * @param value The value being checked for in the set.
	 * @return true if the set contains value, else false.
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	}
	
	/**
	 * This method returns the largest element in the set.
	 * It throws an IntegerSetException if the set is empty.
	 * @return the largest integer element in the set.
	 */
	public int largest() throws IntegerSetException {
		int currentMaximum = Integer.MIN_VALUE;
		if (this.set.size() == 0) {
			throw new IntegerSetException("Error calling largest(). The IntegerSet is empty.");
		}
		for (int i=0; i<this.set.size(); i++) {
			if (this.set.get(i) > currentMaximum) {
				currentMaximum = this.set.get(i);
			}
		}
		return currentMaximum;
	}
	
	/**
	 * This method returns the smallest element in the set.
	 * It throws an IntegerSetException if the set is empty.
	 * @return the smallest integer element in the set.
	 */
	public int smallest() throws IntegerSetException {
		int currentMinimum = Integer.MAX_VALUE;
		if (this.set.size() == 0) {
			throw new IntegerSetException("Error calling smallest(). The IntegerSet is empty.");
		}
		for (int i=0; i<this.set.size(); i++) {
			if (this.set.get(i) < currentMinimum) {
				currentMinimum = this.set.get(i);
			}
		}
		return currentMinimum;
	}
	
	/**
	 * This method adds the specified element to the set.
	 * If the element already exists in the set, the method does nothing.
	 * @param item The integer being added to the set.
	 */
	public void add(int item) {
		if (!this.set.contains(item)) {
			this.set.add(item);
		}
	}
	
	/**
	 * This method removes the specified element from the set.
	 * If the element does not exist in the set, the method does nothing.
	 * @param item The integer to be removed from the set.
	 */
	public void remove(int item) {
		if (this.set.contains(item)) {
			int itemIdx = this.set.indexOf(item);
			this.set.remove(itemIdx);
		}
	}
	
	/**
	 * This method creates the union of the set and a second specified set.
	 * @param intSetb The second set that a union is being formed with.
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> numbersToAdd= new ArrayList<Integer>();
		for (int i=0; i<intSetb.set.size(); i++) {
			if (!this.set.contains(intSetb.set.get(i))) {
				numbersToAdd.add(intSetb.set.get(i));
			}
		}
		for (int number: numbersToAdd) {
			this.set.add(number);
		}
	}
	
	/**
	 * This method creates the intersection between the set and a second specified
	 * set.
	 * @param intSetb The second set that an intersection is being formed with.
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> numbersToGo = new ArrayList<Integer>();
		for (int i=0; i<this.set.size(); i++) {
			if (!intSetb.set.contains(this.set.get(i))) {
				numbersToGo.add(this.set.get(i));
			}
		}
		for (int number: numbersToGo) {
			int numIdx = this.set.indexOf(number);
			this.set.remove(numIdx);
		}
	}
	
	/**
	 * This method creates the difference between the set and a second specified
	 * set.
	 * @param intSetb The second set that a difference is being created with.
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> numbersToGo = new ArrayList<Integer>();
		for (int i=0; i<this.set.size(); i++) {
			if (intSetb.set.contains(this.set.get(i))) {
				numbersToGo.add(this.set.get(i));
			}
		}
		for (int number: numbersToGo) {
			int numIdx = this.set.indexOf(number);
			this.set.remove(numIdx);
		}
	}
	
	/**
	 * This methods check for whether a set contains any elements or not.
	 * @return true if the set is empty, else false.
	 */
	public boolean isEmpty() {
		return this.set.size() == 0;
	}
	
	/**
	 * This method creates and returns a string representation of an IntegerSet object.
	 * @return A string representation of the set.
	 */
	public String toString() {
		return this.set.toString();
	}
}
