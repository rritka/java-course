package dto.parts.tank.exceptions;

public class FillFuelWithStartEngineException extends Exception {
    public FillFuelWithStartEngineException() {
    }

    public FillFuelWithStartEngineException(String message) {
        super(message);
    }

    public FillFuelWithStartEngineException(String message, Throwable cause) {
        super(message, cause);
    }

    public FillFuelWithStartEngineException(Throwable cause) {
        super(cause);
    }

    public FillFuelWithStartEngineException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
