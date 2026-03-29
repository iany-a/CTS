package ro.ase.csie.cts.designpatterns.factory.gameexample.derrived;

import ro.ase.csie.cts.designpatterns.factory.gameexample.root.AbstractSpaceship;

public class FederationSpaceship extends AbstractSpaceship {
    private boolean hasActiveShields;

    public FederationSpaceship(String name, boolean hasActiveShields) {
        this.name = name;
        this.hasActiveShields = hasActiveShields;
    }


}
