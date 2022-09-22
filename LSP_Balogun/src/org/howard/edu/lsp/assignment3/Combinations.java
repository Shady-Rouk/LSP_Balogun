package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Farouk Balogun
 * 
 * @author olaol
 *
 */
public class Combinations {
	
	/**
	 * This method computes the indexes of the different sets of numbers that add up to a given sum 
	 * in an input integer array.
	 * @param input The array of integers.
	 * @param sum The target sum.
	 */
	@SuppressWarnings("unchecked")
	public void compute(int[] input, int sum) {
		ArrayList<HashSet<Integer>> combinations = new ArrayList<HashSet<Integer>>();
		if (input.length == 1 && input[0] == sum) {
			HashSet<Integer> combinationSet = new HashSet<Integer>();
			combinationSet.add(0);
			combinations.add(combinationSet);
		} else {
			for (int i=0; i<input.length; i++) {
				int runningSum = input[i];
				HashSet<Integer> combinationSet = new HashSet<Integer>();
				combinationSet.add(i);
				for (int j=0; j<input.length; j++) {
					if (i==j) {
						continue;
					}
					runningSum += input[j];
					if (runningSum < sum) {
						combinationSet.add(j);
					} else if (runningSum > sum) {
						runningSum -= input[j];
						if (runningSum == sum && !combinations.contains(combinationSet)) {
							combinations.add((HashSet<Integer>)combinationSet.clone());
						}
					} else {
						combinationSet.add(j);
						if (!combinations.contains(combinationSet)) {
							combinations.add((HashSet<Integer>)combinationSet.clone());
						}
						combinationSet.clear();
						combinationSet.add(i);
						runningSum = input[i];
					}
					
				}
			}
		}
		printComputeOutput(input, sum, combinations);
		System.out.println("\n");
	}
	
	/**
	 * This method prints the input parameters to stdout along with the results
	 * of calling the compute method.
	 * @param input The array of integers.
	 * @param sum The target sum.
	 * @param combinations The collection of index combinations that add up to sum.
	 */
	public void printComputeOutput(int[] input, int sum, ArrayList<HashSet<Integer>> combinations) {
		System.out.println("Input: " + Arrays.toString(input) + " Sum: " + sum);
		System.out.println("Combinations:");
		if (combinations.isEmpty()) {
			System.out.println("[]");
		} else {
			for (HashSet<Integer> combinationSet: combinations) {
				System.out.println(combinationSet);
			}
		}
	}
}
