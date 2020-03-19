package dto.parts.lock.exceptions;

public class KeyIsWrongException extends Exception {
    public KeyIsWrongException() {
    }

    public KeyIsWrongException(String message) {
        super(message);
    }

    public KeyIsWrongException(String message, Throwable cause) {
        super(message, cause);
    }

    public KeyIsWrongException(Throwable cause) {
        super(cause);
    }

    public KeyIsWrongException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
