package org.howard.edu.lsp.midterm.problem1;

/**
 * Farouk Balogun
 * @author olaol
 *
 */

/**
 * A custom exception that extends the base Exception class.
 * Thrown by a method in the VotingMachine class.
 * 
 */
public class UnknownCandidateException extends Exception {
	private static final long serialVersionUID = 5142244085478858929L;
	
	/**
	 * 
	 * @param errorMessage The error message to be delivered when an UnknownCandidateException occurs.
	 */
	public UnknownCandidateException(String errorMessage) {
		super(errorMessage);
	}
}
