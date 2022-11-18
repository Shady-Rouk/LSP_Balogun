package org.howard.edu.lsp.assignnment7;

/**
 * Farouk Balogun
 * @author olaol
 *
 */
public class EmptyListException extends Exception {
	private static final long serialVersionUID = 4234993680915322637L;
	
	/**
	 * @param errorMessage The error message to be delivered when an IntegerSetException occurs.
	 */
	public EmptyListException(String errorMessage) {
		super(errorMessage);
	}
}
