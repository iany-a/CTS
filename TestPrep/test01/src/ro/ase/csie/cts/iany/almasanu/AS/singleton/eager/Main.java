package ro.ase.csie.cts.iany.almasanu.AS.singleton.eager;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        OrderManager o1 = OrderManager.getOrder();
        OrderManager o2 = OrderManager.getOrder();

        if (o1 == o2) System.out.println("Using the same order manager.");
        else System.out.println("Using different order managers.");



        //o1.logCancelOrder("latte");
        o2.logNewOrder("espresso");

        System.out.println("Number of orders for manager 1: " + o1.getNoOfOrders());
        System.out.println("Number of orders for manager 2: " + o2.getNoOfOrders());

        o1.logCancelOrder("latte");
        System.out.println("Number of orders for manager 1: " + o1.getNoOfOrders());
        System.out.println("Number of orders for manager 2: " + o2.getNoOfOrders());


        o1.logCancelOrder("latte");
        System.out.println("Number of orders for manager 1: " + o1.getNoOfOrders());
        System.out.println("Number of orders for manager 2: " + o2.getNoOfOrders());


    }
}
