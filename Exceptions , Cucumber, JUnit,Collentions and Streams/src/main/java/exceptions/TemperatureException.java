package exceptions;

public class TemperatureException extends Exception{
    public TemperatureException(){

    }
    public TemperatureException(String message){
        super(message);
    }
    public TemperatureException(String message, Throwable cause){
        super(message,cause);
    }
    public TemperatureException(Throwable cause){
        super(cause);
    }
    public TemperatureException(String message,Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
