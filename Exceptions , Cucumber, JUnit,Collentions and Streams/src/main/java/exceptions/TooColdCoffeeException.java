package exceptions;

public class TooColdCoffeeException extends TemperatureException{

    public TooColdCoffeeException() {
    }
    public TooColdCoffeeException(String message) {
        super(message);
    }

    public TooColdCoffeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooColdCoffeeException(Throwable cause) {
        super(cause);
    }

    public TooColdCoffeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
