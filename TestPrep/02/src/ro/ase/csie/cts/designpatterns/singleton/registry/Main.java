package ro.ase.csie.cts.designpatterns.singleton.registry;

public class Main {
    public static void main(String[] args) {
        ServiceRegistry delete = ServiceRegistry.DELETE;
        System.out.println(delete.getName());

        ServiceRegistry load = ServiceRegistry.LOAD;
        System.out.println(load.getName());

        if (delete == load) System.out.println("Same service");
        else System.out.println("Different services");

        ServiceRegistry delete2 = ServiceRegistry.DELETE;
        System.out.println(delete2.getName());

        if (delete == delete2) System.out.println("Same service");
        else System.out.println("Different services");

        delete2.execute();
        load.execute();

    }
}
