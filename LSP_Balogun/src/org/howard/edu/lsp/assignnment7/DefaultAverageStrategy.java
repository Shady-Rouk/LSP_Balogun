package org.howard.edu.lsp.assignnment7;

import java.util.List;

/**
 * Farouk Balogun
 * @author olaol
 *
 */
public class DefaultAverageStrategy implements AverageStrategy {
	
	@Override
	/**
	 * This method returns the average grade from a list of grades.
	 * @param grades The list of grades.
	 * @return the average grade from the list of grades.
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() == 0) {
			throw new EmptyListException("The input list is empty.");
		}
		int total = 0;
		for (int num: grades) {
			total += num;
		}
		int avg = total / grades.size();
		return avg;
	}

}
