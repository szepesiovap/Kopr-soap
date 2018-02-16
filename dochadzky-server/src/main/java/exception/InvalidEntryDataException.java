package exception;

public class InvalidEntryDataException extends RuntimeException {

    /**
     * Creates a new instance of <code>InvalidEntryDataException</code> without
     * detail message.
     */
    public InvalidEntryDataException() {
    }

    /**
     * Constructs an instance of <code>InvalidEntryDataException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidEntryDataException(String msg) {
        super(msg);
    }
}
