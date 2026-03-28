package ro.ase.csie.cts.iany.almasanu.AS.singleton.lazy;

import ro.ase.csie.cts.iany.almasanu.AS.singleton.IOrderLogging;

public class OrderManager implements IOrderLogging {

    private static int noOrders;


    private static OrderManager orderManager = null;
    private OrderManager(){
        noOrders = 0;

    }

   public static synchronized OrderManager getOrderManager(){
        if (orderManager == null){
            orderManager = new OrderManager();
        }
        return orderManager;
   }

    @Override
    public int getNoOfOrders() {
        return noOrders;
    }

    @Override
    public void logNewOrder(String drinkType) {
        System.out.println("New order for: " + drinkType);
        createOrder();
    }

    @Override
    public void logCancelOrder(String drinkType) {
        System.out.println("Order canceled for " +drinkType);
        cancelOrder();
    }

    private static void createOrder(){
        ++noOrders;
    }

    private static void cancelOrder(){
        if (noOrders > 0) --noOrders;
        else noOrders = 0;
    }



}
