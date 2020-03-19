package dto.parts.engine.exceptions;

public class EngineNotStartedException extends Exception {
    public EngineNotStartedException() {
    }

    public EngineNotStartedException(String message) {
        super(message);
    }

    public EngineNotStartedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EngineNotStartedException(Throwable cause) {
        super(cause);
    }

    public EngineNotStartedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
