package exception;

public class UcastnikNotFoundException extends RuntimeException {

    /**
     * Creates a new instance of <code>UcastnikNotFoundException</code> without
     * detail message.
     */
    public UcastnikNotFoundException() {
    }

    /**
     * Constructs an instance of <code>UcastnikNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UcastnikNotFoundException(String msg) {
        super(msg);
    }
}
