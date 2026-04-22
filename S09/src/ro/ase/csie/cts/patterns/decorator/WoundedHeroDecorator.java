package ro.ase.csie.cts.patterns.decorator;

import ro.ase.csie.cts.patterns.decorator.AbstractAcmeHero;

public class WoundedHeroDecorator extends AbstractHeroDecorator{

    public WoundedHeroDecorator(AbstractAcmeHero decoratedHero) {
        super(decoratedHero);
    }

    @Override
    public void walk() {
        System.out.println(this.decoratedHero.name + " is crawling.");
    }

    @Override
    public void takeAHit(int points) {
        this.decoratedHero.takeAHit(points);
    }
}
