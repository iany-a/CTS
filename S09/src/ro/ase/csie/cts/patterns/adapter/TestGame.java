package ro.ase.csie.cts.patterns.adapter;

import ro.ase.csie.cts.patterns.adapter.disney.DonaldDuck;
import ro.ase.csie.cts.patterns.adapter.disney.IDisneyHero;

public class TestGame {
    public static void main(String[] args) {
        AbstractAcmeHero superman = new AcmeHero("Superman");
        superman.walk();
        superman.takeAHit(10);

        //this is not good, as the game becomes "game in a game"
       IDisneyHero donald = new DonaldDuck();
//        donald.run(10);

        //need to use adapter to integrate the disney characters into the AbstractAcmeHero class
        //existent class = 2nd class that will adapt to 1st
        //2nd class will have a has-a relation with the Adaptor class
        //which extends the destination class (1st class)

        AbstractAcmeHero adaptedDonald = new Disney2AcmeAdapter(donald);
        adaptedDonald.walk();
        adaptedDonald.takeAHit(20);

        superman = adaptedDonald;

        superman = new Disney2AcmeAdapter(new DonaldDuck());
        superman.walk();

    }
}
