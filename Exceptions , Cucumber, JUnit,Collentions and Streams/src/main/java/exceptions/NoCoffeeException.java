package exceptions;

public class NoCoffeeException extends Exception{

    public NoCoffeeException(){

    }
    public NoCoffeeException(String message){
        super(message);
    }

    public NoCoffeeException(String message, Throwable cause){
        super(message,cause);
    }

    public NoCoffeeException(Throwable cause){
        super(cause);
    }

    public NoCoffeeException(String message,Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
