package ro.ase.csie.cts.designpatterns.factory.gameexample.derrived;

import ro.ase.csie.cts.designpatterns.factory.gameexample.root.AbstractSpaceship;

public class RomulanSpaceship extends AbstractSpaceship {
    private int phasersPower;

    public RomulanSpaceship(String name, int phasesPower) {
        this.name = name;
        this.phasersPower = phasesPower;
    }
}
