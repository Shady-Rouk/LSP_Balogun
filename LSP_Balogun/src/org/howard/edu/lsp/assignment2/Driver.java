package org.howard.edu.lsp.assignment2;

/**
 * Farouk Balogun
 * 
 * @author olaol
 *
 */

public class Driver {

	public static void main(String[] args) {
		Combinations comb = new Combinations();
		// valid combinations exist.
		comb.compute(new int[] {5,5,15,10}, 15);
		comb.compute(new int[] {1,2,3,4,5,6}, 6);
		comb.compute(new int[] {1,1,1,1,1}, 1);
		comb.compute(new int[] {1,2,3,4,1,2}, 2);
		comb.compute(new int[] {0,1,2,3,4,5,0}, 0);
		comb.compute(new int[] {1,1,1,1,1}, 5);
		// no valid combinations exist.
		comb.compute(new int[] {1,2,3,4,5}, 0);
		comb.compute(new int[] {1,2,3,4,5}, 16);
		comb.compute(new int[] {}, 15);
		comb.compute(new int[] {1,1,1,1,1}, 6);
	}

}
