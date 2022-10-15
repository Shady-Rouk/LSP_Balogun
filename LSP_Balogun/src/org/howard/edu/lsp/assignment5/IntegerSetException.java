package org.howard.edu.lsp.assignment5;

/**
 * 
 * Farouk Balogun
 * 
 * @author olaol
 *
 */

/**
 * 
 * A custom exception that extends the base Exception class.
 * Thrown by methods in the IntegerSet class.
 * 
 */
public class IntegerSetException extends Exception {

	private static final long serialVersionUID = 6585988606273525868L;

	/**
	 * @param errorMessage The error message to be delivered when an IntegerSetException occurs.
	 */
	public IntegerSetException(String errorMessage) {
		super(errorMessage);
	}
}
