package en.ase.csie.cts.patterns.flyweight;

public class TestGame {
    public static void main(String[] args) {
        //no modelsFactory as it's static.
        SpriteFlyweight building1 = new SpriteFlyweight("Building Model 1");
        SpriteFlyweight building2 = new SpriteFlyweight("Building Model 1");
        SpriteFlyweight building3 = new SpriteFlyweight("Building Model 1");

        building1.displayOnScreen(10,10,10,"Green");
        building2.displayOnScreen(20, 100, 56, "Green");
        building3.displayOnScreen(200, 450, 35, "Red");

        //the main idea is using a registry singleton inside the model factory.
    }
}
