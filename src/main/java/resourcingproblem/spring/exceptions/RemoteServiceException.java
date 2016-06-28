package resourcingproblem.spring.exceptions;

/**
 * The Class RemoteServiceException.
 */
public class RemoteServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new remote service exception.
	 *
	 * @param message
	 *            the message
	 */
	public RemoteServiceException( final String message) {
		super(message);
	}
}
