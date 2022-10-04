package exceptions;

public class Person {
    private static int maxCoffeeTemperature = 80;
    private static int minCoffeeTemperature = 30;
    private static int minQuantity = 3;
    public static void orderCoffee(CupOfCoffee cupOfCoffee) throws NoCoffeeException {
        if(cupOfCoffee.getQuantity() < minQuantity) {
            throw new NoCoffeeException("There is no enough coffee in the machine");
        }
    }
   public static void drinkCoffee(CupOfCoffee cupOfCoffee) throws TooColdCoffeeException,TooHotCoffeeException{
        if (cupOfCoffee.getTemperature() > maxCoffeeTemperature){
            throw new TooHotCoffeeException("This coffee is too hot");
        }
        if (cupOfCoffee.getTemperature() < minCoffeeTemperature){
            throw new TooColdCoffeeException("This coffee is too cold");
        }
        System.out.println("You can take your coffee");
    }
}
