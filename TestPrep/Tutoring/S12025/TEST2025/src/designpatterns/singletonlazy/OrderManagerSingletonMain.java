package designpatterns.singletonlazy;

public class OrderManagerSingletonMain {
    public static void main(String[] args) {
        OrderManager o1 = OrderManager.getInstance();
        OrderManager o2 = OrderManager.getInstance();

        if(o1 == o2) System.out.println("Same instance");
        else System.out.println("Different instances");

        System.out.println(o1.getNoOfOrders());

    }
}
