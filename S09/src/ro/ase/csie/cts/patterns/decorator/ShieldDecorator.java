package ro.ase.csie.cts.patterns.decorator;

public class ShieldDecorator extends AbstractHeroDecorator{

    private int shieldStrenght;

    public ShieldDecorator(AbstractAcmeHero decoratedHero, int strenght) {
        super(decoratedHero);
        this.shieldStrenght = strenght;
    }

    @Override
    public void walk() {
        this.decoratedHero.walk();
    }

    @Override
    public void takeAHit(int points) {
        System.out.println("Using shield.");
        if (points > shieldStrenght){
            this.stamina -= (points - shieldStrenght);
            System.out.println("Lose some points.");
        }
    }
}
