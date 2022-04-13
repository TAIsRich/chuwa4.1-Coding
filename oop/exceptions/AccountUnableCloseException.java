package exceptions;

public class AccountUnableCloseException extends RuntimeException{
    public AccountUnableCloseException(final String message) {super(message);}

    public AccountUnableCloseException(final String message, final Exception e) {super(message, e);}
}
