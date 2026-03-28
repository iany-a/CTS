package ro.ase.csie.cts.iany.almasanu.AS.singleton.lazy;

import ro.ase.csie.cts.iany.almasanu.AS.singleton.IOrderLogging;

public class OrderManager implements IOrderLogging {

    private final int noOrders;
    //private DrinkType drinkType = DrinkType.Espresso;
    //private Milk milk = Milk.Whole;
    //private Size size = Size.Medium;

    private static OrderManager orderManager = null;
    private OrderManager(){
        this.noOrders = 0;

    }

   public static synchronized OrderManager getOrder(){
        if (orderManager == null){
            orderManager = new OrderManager();
        }
//        this.noOrders +=1;
        return orderManager;
   }

    @Override
    public int getNoOfOrders() {
        //System.out.println("Number of orders " + noOrders);
        return this.noOrders;
    }

    @Override
    public void logNewOrder(String drinkType) {
        System.out.println("New order for: " + drinkType);
    }

    @Override
    public void logCancelOrder(String drinkType) {
        System.out.println("Order canceled for " +drinkType);
    }
}
