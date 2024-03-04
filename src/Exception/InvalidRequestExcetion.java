package Exception;

public class InvalidRequestExcetion extends RuntimeException {
    public InvalidRequestExcetion() {
    }

    public InvalidRequestExcetion(String message) {
        super(message);
    }

    public InvalidRequestExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidRequestExcetion(Throwable cause) {
        super(cause);
    }

    public InvalidRequestExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
