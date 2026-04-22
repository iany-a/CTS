package ro.ase.csie.cts.patterns.adapter;

import ro.ase.csie.cts.patterns.adapter.disney.IDisneyHero;

public class Disney2AcmeClassAdapter extends AbstractAcmeHero implements IDisneyHero {

    @Override
    public void walk() {

    }

    @Override
    public void takeAHit(int points) {

    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void changeColor(String newColor) {

    }

    @Override
    public String getName() {
        return "";
    }
}
