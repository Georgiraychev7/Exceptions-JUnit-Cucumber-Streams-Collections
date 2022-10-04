package exceptions;

public class TooHotCoffeeException extends TemperatureException{

    public TooHotCoffeeException() {
    }
    public TooHotCoffeeException(String message) {
        super(message);
    }

    public TooHotCoffeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooHotCoffeeException(Throwable cause) {
        super(cause);
    }

    public TooHotCoffeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
