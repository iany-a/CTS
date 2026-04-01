package designpatterns.singletoneager;

public class OrderManagerSingletonMain {
    public static void main(String[] args) {
        OrderManager o1 = OrderManager.getInstance();
        System.out.println("No of orders: " + o1.getNoOfOrders());

        OrderManager o2 = OrderManager.getInstance();



        OrderManager o3 = OrderManager.getInstance();

        if(o1 == o3) System.out.println("Same instance");
        else System.out.println("Different instances");

//        o2.logNewOrder("Drink 1");
//        System.out.println("No of orders: " + o1.getNoOfOrders());

        o3.logCancelOrder("DRINK 3");
        System.out.println("No of orders: " + o1.getNoOfOrders());


    }
}
