package ro.ase.csie.cts.design.patterns.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Superhero superman = new Superhero.SuperheroBuilder("Superman")
                .addShield(100)
                .addStamina(100)
                .addPositiveKarma()
                .build();

        Superhero batman = new Superhero.SuperheroBuilder("Batman")
                .addPositiveKarma()
                .addShield(100)
                .addStamina(120)
                .build();

        //Role of the directory would be to reuse code



    }
}
