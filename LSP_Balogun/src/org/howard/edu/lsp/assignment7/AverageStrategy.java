package org.howard.edu.lsp.assignment7;

import java.util.*;

/**
 * Farouk Balogun
 * @author olaol
 *
 */
public interface AverageStrategy {
	/**
	 * This method returns the average grade from a list of grades.
	 * @param grades The list of grades.
	 * @return the average grade from the list of grades.
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException;
}
