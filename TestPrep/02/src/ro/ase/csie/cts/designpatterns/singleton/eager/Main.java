package ro.ase.csie.cts.designpatterns.singleton.eager;

public class Main {
    public static void main(String[] args) {
        ServiceEager se1 = ServiceEager.getInstance();
        ServiceEager se2 = ServiceEager.getInstance();

        if (se1==se2) System.out.println("Same obj");
        else System.out.println("Diff obj");
    }
}
