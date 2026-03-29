package ro.ase.csie.cts.designpatterns.factory.gameexample;

import ro.ase.csie.cts.designpatterns.factory.gameexample.derrived.FederationSpaceship;
import ro.ase.csie.cts.designpatterns.factory.gameexample.derrived.Liberty;
import ro.ase.csie.cts.designpatterns.factory.gameexample.derrived.RomulanSpaceship;
import ro.ase.csie.cts.designpatterns.factory.gameexample.derrived.enums.Powers;
import ro.ase.csie.cts.designpatterns.factory.gameexample.root.AbstractSpaceship;

public class SpaceshipFactory {
    public static AbstractSpaceship getSpaceship(Type type, String name){
        return switch (type) {
            case ROMULAN -> new RomulanSpaceship(name, 100);
            case FEDERATION -> new FederationSpaceship(name, false);
            case LIBERTY -> new Liberty(name, Powers.INSTANT_WARP);
            default -> throw new UnsupportedOperationException("Invalid Object type");
        };
    }
}
