package designpatterns.singletoneager;

public class OrderManager implements IOrderLogging {

    private static int noOrders = 0;

    private OrderManager() {
    }

    private static OrderManager orderManager = new OrderManager();

    public static synchronized OrderManager getInstance(){
        return orderManager;
    }


    @Override
    public int getNoOfOrders() {
        return noOrders;
    }



    @Override
    public void logNewOrder(String drinkType) {
        System.out.println("New order for drink name: " + drinkType);
        noOrders++;
    }

    @Override
    public void logCancelOrder(String drinkType) {
        System.out.println("Cancelled order for drink name: " + drinkType);
        if (noOrders > 0) noOrders--;
        else noOrders = 0;
    }
}
