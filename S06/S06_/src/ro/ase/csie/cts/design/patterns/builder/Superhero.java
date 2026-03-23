package ro.ase.csie.cts.design.patterns.builder;

public class Superhero {
    private String name;
    private boolean hasPositiveKarma;
    private int stamina;
    private String superPower;
    private String weapon;
    private int shieldLevel;

    private Superhero(){
        //remove ability to use default constructor
    }

    public String getName() {
        return name;
    }

    public boolean isHasPositiveKarma() {
        return hasPositiveKarma;
    }

    public int getStamina() {
        return stamina;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getShieldLevel() {
        return shieldLevel;
    }

    //NB: if you want to generate setters, generate them at PRIVATE, or don't generate them at all!
    //static inner builder class
    public static class SuperheroBuilder{
        //create outer object inside inner builder
        Superhero hero = new Superhero(); //Init Option 1

        //create constructor for inner builder
        public SuperheroBuilder(String name){
        //this.hero = new Superhero() // Init Option 2
            this.hero.name = name;
        }

        public SuperheroBuilder addPositiveKarma(){
            this.hero.hasPositiveKarma = true;
            return this;
        }

        public SuperheroBuilder addStamina(int value){
            this.hero.stamina = value;
            return this;
        }

        public SuperheroBuilder addSuperPower(String power){
            this.hero.superPower = power;
            return this;
        }

        public SuperheroBuilder addWeapon(String weapon){
            this.hero.weapon = weapon;
            return this;
        }

        public SuperheroBuilder addShield(int value){
            this.hero.shieldLevel = value;
            return this;
        }

        public Superhero build(){
            return this.hero;
        }

    }


}
