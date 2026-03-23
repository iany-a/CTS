package ro.ase.csie.cts.design.patterns.prototype;

public class TestPrototype {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        SpaceObject3DModel asteroid1 = new SpaceObject3DModel("ASTEROID0001");
        //SpaceObject3DModel asteroid2 = new SpaceObject3DModel("ASTEROID0002");
        SpaceObject3DModel asteroid2 = (SpaceObject3DModel) asteroid1.clone();
        SpaceObject3DModel asteroid3 = (SpaceObject3DModel) asteroid1.clone();
        System.out.println("Done");
    }
}
