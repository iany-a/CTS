package ro.ase.csie.cts.iany.almasanu.AS.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        OrderManager o1 = OrderManager.getOrderManager();
        OrderManager o2 = OrderManager.getOrderManager();

        if (o1 == o2) System.out.println("Using the same order manager...");
        else System.out.println("Using different order managers...");

        System.out.println("No of current orders for o1: " + o1.getNoOfOrders());

        o1.logCancelOrder("mocca");
        System.out.println("No of current orders for o1: " + o1.getNoOfOrders());

        o1.logNewOrder("espresso");
        System.out.println("No of current orders for o1: " + o1.getNoOfOrders());

        o2.logNewOrder("mocca");
        System.out.println("No of current orders for o2: " + o1.getNoOfOrders());

        o1.logCancelOrder("mocca");
        System.out.println("No of current orders for o1: " + o1.getNoOfOrders());
        o1.logCancelOrder("espresso");
        System.out.println("No of current orders for o1: " + o1.getNoOfOrders());
        o1.logCancelOrder("espresso");
        System.out.println("No of current orders for o1: " + o1.getNoOfOrders());

    }
}
