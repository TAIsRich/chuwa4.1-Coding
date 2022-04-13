package exceptions;

public class InvalidInputException extends RuntimeException{

    public InvalidInputException(final String message) {super(message);}

    public InvalidInputException(final String message, final Exception e) {super(message, e);}
}
