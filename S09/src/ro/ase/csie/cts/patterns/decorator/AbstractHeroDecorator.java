package ro.ase.csie.cts.patterns.decorator;

import ro.ase.csie.cts.patterns.decorator.AbstractAcmeHero;

public class AbstractHeroDecorator extends AbstractAcmeHero{

    protected AbstractAcmeHero decoratedHero; //decorated object is mandatory

    public AbstractHeroDecorator(AbstractAcmeHero decoratedHero) {
        this.decoratedHero = decoratedHero;
    }



    @Override
    public void walk() {

    }

    @Override
    public void takeAHit(int points) {

    }


}
