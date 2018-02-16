package exception;

public class PredmetNotFoundException extends RuntimeException {

    /**
     * Creates a new instance of <code>PredmetNotFoundException</code> without
     * detail message.
     */
    public PredmetNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PredmetNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PredmetNotFoundException(String msg) {
        super(msg);
    }
}
