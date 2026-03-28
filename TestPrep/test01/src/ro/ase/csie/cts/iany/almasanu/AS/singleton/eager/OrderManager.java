package ro.ase.csie.cts.iany.almasanu.AS.singleton.eager;

import ro.ase.csie.cts.iany.almasanu.AS.singleton.IOrderLogging;

public class OrderManager implements IOrderLogging {
    private static OrderManager orderManager = new OrderManager();
    private static int noOrders = 0;

    private OrderManager(){
        System.out.println("Creating order manager...");
    }

    public static synchronized OrderManager getOrderManager(){
        return orderManager;
    }



    @Override
    public int getNoOfOrders() {
        return noOrders;
    }

    @Override
    public void logNewOrder(String drinkType) {
        System.out.println("New order logged, type: " + drinkType);
        newOrder();
    }

    public static void newOrder(){
        ++OrderManager.noOrders;
    }

    public static void cancelOrder(){
        if (OrderManager.noOrders >0)  --OrderManager.noOrders;
        else OrderManager.noOrders = 0;
    }


    @Override
    public void logCancelOrder(String drinkType) {
        System.out.println("Order cancelled, type: " + drinkType);
        cancelOrder();
    }
}
