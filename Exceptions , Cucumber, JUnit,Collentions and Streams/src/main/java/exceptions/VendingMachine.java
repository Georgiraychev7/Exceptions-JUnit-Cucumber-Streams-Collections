package exceptions;

public class VendingMachine {

   public static void serveCoffee(Person person, CupOfCoffee cupOfCoffee){
        try {
            person.drinkCoffee(cupOfCoffee);
        } catch (TooHotCoffeeException e){
            e.printStackTrace();
            System.out.println("Sorry this coffee is not for you");
        } catch (TooColdCoffeeException e){
            e.printStackTrace();
            System.out.println("Sorry this coffee is not for you");
        }
    }
   public static void orderCoffee(Person person, CupOfCoffee cupOfCoffee){
        try {
            person.orderCoffee(cupOfCoffee);
        } catch (NoCoffeeException e){
            e.printStackTrace();
            throw new RuntimeException("This coffee can not be ordered");
        } finally {
            if(cupOfCoffee.getQuantity() < 2){
                System.out.println("There is not enough coffee in the machine");
            } else {
                System.out.println("Your coffee is preparing");
            }
        }
    }
    public static void finishingOrder(Person person, CupOfCoffee cupOfCoffee){
       try(FinishingOrder finishingOrder = new FinishingOrder()) {
       } catch (RuntimeException e){
           e.printStackTrace();
       }
    }
}
