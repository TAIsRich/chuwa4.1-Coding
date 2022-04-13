
public class InvalidAmountException extends Exception {
	
	private static final String DEFAULT_MESSAGE = "Invalid amount";
	
	public InvalidAmountException() {
		super(DEFAULT_MESSAGE);
	}
	
	public InvalidAmountException(String message) {
		super(message);
	}
}
