package ro.ase.csie.cts.patterns.adapter.disney;

public class DonaldDuck implements IDisneyHero{

    @Override
    public void run(int distance) {
        System.out.println("Donald runs for " + distance + " meters.");
    }

    @Override
    public void changeColor(String newColor) {
        System.out.println("Donald new color is " + newColor + ".");
    }

    @Override
    public String getName() {
        return "Donald";
    }


}
