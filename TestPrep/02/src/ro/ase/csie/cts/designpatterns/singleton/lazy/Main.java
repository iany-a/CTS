package ro.ase.csie.cts.designpatterns.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        ServiceLazy sl1 = ServiceLazy.getInstance();
        ServiceLazy sl2 = ServiceLazy.getInstance();

        if (sl1 == sl2) System.out.println("Same object");
        else System.out.println("Different objects");
    }
}
