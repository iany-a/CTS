package ro.ase.csie.cts.designpatterns.factory.gameexample.derrived;

import ro.ase.csie.cts.designpatterns.factory.gameexample.root.AbstractSpaceship;
import ro.ase.csie.cts.designpatterns.factory.gameexample.derrived.enums.Powers;

public class Liberty extends AbstractSpaceship {
    private Powers power;

    public Liberty(String name, Powers power) {
        this.power = power;
    }
}
