package ro.ase.csie.cts.designpatterns.factory.gameexample;

import ro.ase.csie.cts.designpatterns.factory.gameexample.root.AbstractSpaceship;

public class Main {
    public static void main(String[] args) {
        AbstractSpaceship factory1 = SpaceshipFactory.getSpaceship(Type.FEDERATION, "factory1 fed");
        AbstractSpaceship factory2 = SpaceshipFactory.getSpaceship(Type.ROMULAN, "factory2 romulan");
        AbstractSpaceship factory3 = SpaceshipFactory.getSpaceship(Type.LIBERTY, "factory3 lib");
    }
}
