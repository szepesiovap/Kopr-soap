package exception;

public class PrezenckaNotFoundException extends RuntimeException {

    /**
     * Creates a new instance of <code>PrezenckaNotFoundException</code> without
     * detail message.
     */
    public PrezenckaNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PrezenckaNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public PrezenckaNotFoundException(String msg) {
        super(msg);
    }
}
