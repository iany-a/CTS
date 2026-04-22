package ro.ase.csie.cts.patterns.adapter;

import ro.ase.csie.cts.patterns.adapter.disney.IDisneyHero;

public class Disney2AcmeAdapter extends AbstractAcmeHero{

    private IDisneyHero disneyHero; //object from 2nd class is needed

    public Disney2AcmeAdapter(IDisneyHero disneyHero) {
        this.disneyHero = disneyHero;
    }



    @Override
    public void walk() {
        //adapt walk to run
        this.disneyHero.run(5);
    }

    @Override
    public void takeAHit(int points) {
        this.stamina -=points;
        System.out.println(this.disneyHero.getName() + " takes a hit of " + points + ".");
    }
}
