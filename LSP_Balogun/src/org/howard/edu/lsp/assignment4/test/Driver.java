package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

/**
 * 
 * Farouk Balogun
 * 
 * @author olaol
 *
 */

/**
 * Driver class to test the behaviors of the IntegerSet class.
 */
public class Driver {

	public static void main(String[] args) {		
		// Initializing IntegerSet objects
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		System.out.println("***Initialized 4 sets that start out empty***");
		System.out.println("set1: " + set1.toString());
		System.out.println("set2: " + set2.toString());
		System.out.println("set3: " + set3.toString());
		System.out.println("set4: " + set4.toString());
		System.out.println("\n");
		
		// Test for clear method
		System.out.println("***Testing clear() method***");
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Value of set1 before calling clear(): " + set1.toString());
		set1.clear();
		System.out.println("Value of set1 after calling clear(): " + set1.toString());
		
		System.out.println("Value of set2 before calling clear(): " + set2.toString());
		set2.clear();
		System.out.println("Value of set2 after calling clear(): " + set2.toString());
		System.out.println("\n");
		
		// Test for length method
		System.out.println("***Testing length() method***");
		set3.add(1);
		set3.add(2);
		System.out.println("Value of set3: " + set3.toString());
		System.out.println("Length of set3: " + String.valueOf(set3.length()));
		
		System.out.println("Value of set4: " + set4.toString());
		System.out.println("Length of set4: " + String.valueOf(set4.length()));
		System.out.println("\n");
		
		// Test for equals method
		System.out.println("***Testing equals() method***");
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Value of set4: " + set4.toString());
		System.out.println("Result of set1.equals(set4): " + String.valueOf(set1.equals(set4)));
		System.out.println("Result of set4.equals(set1): " + String.valueOf(set4.equals(set1)));
		
		set2.clear();
		set3.clear();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set3.add(3);
		set3.add(2);
		set3.add(1);
		System.out.println("Value of set2: " + set2.toString());
		System.out.println("Value of set3: " + set3.toString());
		System.out.println("Result of set2.equals(set3): " + String.valueOf(set2.equals(set3)));
		System.out.println("Restlt of set3.equals(set2): " + String.valueOf(set3.equals(set2)));
		
		set3.remove(2);
		System.out.println("Value of set2: " + set2.toString());
		System.out.println("Value of set3: " + set3.toString());
		System.out.println("Result of set2.equals(set3): " + String.valueOf(set2.equals(set3)));
		System.out.println("Result of set3.equals(set2): " + String.valueOf(set3.equals(set2)));
		
		set2.clear();
		System.out.println("Value of set2: " + set2.toString());
		System.out.println("Value of set3: " + set3.toString());
		System.out.println("Result of set2.equals(set3): " + String.valueOf(set2.equals(set3)));
		System.out.println("Result of set3.equals(set2): " + String.valueOf(set3.equals(set2)));
		System.out.println("\n");
		set1.clear();
		set2.clear();
		set3.clear();
		set4.clear();
		
		// Test for contains method
		System.out.println("***Testing contains() method***");
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Result of set1.contains(1): " + String.valueOf(set1.contains(1)));
		set2.add(1);
		set2.add(3);
		System.out.println("Value of set2: " + set2.toString());
		System.out.println("Result of set2.contains(1): " + String.valueOf(set2.contains(1)));
		System.out.println("Result of set2.contains(3): " + String.valueOf(set2.contains(3)));
		System.out.println("Result of set2.contains(2): " + String.valueOf(set2.contains(2)));
		System.out.println("\n");
		
		// Test for largest method
		System.out.println("***Testing largest() method***");
		set1.add(-1);
		set1.add(0);
		set1.add(5);
		System.out.println("Value of set1: " + set1.toString());
		try {
			System.out.println("Result of set1.largest(): " + String.valueOf(set1.largest()));
		} catch (IntegerSetException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Value of set4: " + set4.toString());
		try {
			System.out.println("Result of set4.largest(): " + String.valueOf(set4.largest()));
		} catch (IntegerSetException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("\n");
		
		// Test for smallest method
		System.out.println("***Testing smallest() method***");
		System.out.println("Value of set1: " + set1.toString());
		try {
			System.out.println("Result of set1.smallest(): " + String.valueOf(set1.smallest()));
		} catch (IntegerSetException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Value of set4: " + set4.toString());
		try {
			System.out.println("Result of set4.smallest(): " + String.valueOf(set4.smallest()));
		} catch (IntegerSetException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("\n");
		
		// Test for add method
		System.out.println("***Testing add() method***");
		set1.clear();
		System.out.println("Value of set1: " + set1.toString());
		set1.add(3);
		set1.add(4);
		set1.add(4);
		set1.add(5);
		System.out.println("Value of set1 after attempting to add 3, 4, 4, 5: " + set1.toString());
		System.out.println("\n");
		
		// Test for remove method
		System.out.println("***Testing remove() method***");
		System.out.println("Value of set1: " + set1.toString());
		set1.remove(4);
		set1.remove(6);
		System.out.println("Value of set1 after attempting to remove 4, 6: " + set1.toString());
		System.out.println("\n");
		
		// Test for union method
		System.out.println("***Testing union() method***");
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Value of set2: " + set2.toString());
		set1.union(set2);
		System.out.println("Value of set1 after set1.union(set2): " + set1.toString());
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Value of set4: " + set4.toString());
		set4.union(set1);
		System.out.println("Value of set4 after set4.union(set1): " + set4.toString());
		System.out.println("\n");
		
		// Test for intersect method
		System.out.println("***Testing intersect() method***");
		set1.clear();
		set2.clear();
		set3.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Value of set2: " + set2.toString());
		set1.intersect(set2);
		System.out.println("Value of set1 after set1.intersect(set2): " + set1.toString());
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Value of set3: " + set3.toString());
		set1.intersect(set3);
		System.out.println("Value of set1 after set1.intersect(set3): " + set1.toString());
		System.out.println("\n");
		
		// Test for diff method
		System.out.println("***Testing diff() method***");
		set1.clear();
		set2.clear();
		set4.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(1);
		set2.add(2);
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Value of set2: " + set2.toString());
		set1.diff(set2);
		System.out.println("Value of set1 after set1.diff(set2): " + set1.toString());
		System.out.println("Value of set2: " + set2.toString());
		System.out.println("Value of set4: " + set4.toString());
		set2.diff(set4);
		System.out.println("Value of set2 after set2.diff(set4): " + set2.toString());
		set1.add(1);
		set1.add(2);
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Value of set2: " + set2.toString());
		set2.diff(set1);
		System.out.println("Value of set2 after set2.diff(set1): " + set2.toString());
		System.out.println("\n");
		
		// Test for isEmpty method
		System.out.println("***Testing isEmpty() method***");
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Result from set1.isEmpty(): " + String.valueOf(set1.isEmpty()));
		System.out.println("Value of set4: " + set4.toString());
		System.out.println("Result from set4.isEmpty(): " + String.valueOf(set4.isEmpty()));
		System.out.println("\n");
		
		// Test for toString method
		System.out.println("***Testing toString() method***");
		System.out.println("Value of set1: " + set1.toString());
		System.out.println("Value of set2: " + set2.toString());
		System.out.println("Value of set3: " + set3.toString());
		System.out.println("Value of set4: " + set4.toString());
	}

}
