package ro.ase.csie.cts.iany.almasanu.AS.builder;

import ro.ase.csie.cts.iany.almasanu.AS.Enums.Toppings;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Type;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Milk;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Size;

public class DrinkCustomization extends AbstractDrink {
    private Size size;
    private Type type;
    private Milk milk;
    private int noSugarSpoons;
    private Toppings toppings;

    protected DrinkCustomization(String name) {
        super(name);
    }


    public Size getSize() {
        return size;
    }

    public Type getDrinkType() {
        return type;
    }

    public Milk getMilk() {
        return milk;
    }


    @Override
    public void getDrinkDescription() {
        System.out.println(this.toString());
    }

    @Override
    public int getNoOfSugarSpoons() {
        return this.noSugarSpoons;
    }

    @Override
    public String getToppings() {
        return this.toppings.toString();
    }

    public static class DrinkBuilder{

        DrinkCustomization drink;

        public DrinkBuilder(String name){
            this.drink = new DrinkCustomization(name);
        }

        public DrinkBuilder addSize(Size size){
            this.drink.size = size;
            return this;
        }

        public DrinkBuilder addType(Type type){
            this.drink.type = type;
            return this;
        }

        public DrinkBuilder addMilk(Milk milk){
            this.drink.milk = milk;
            return this;
        }

        public DrinkBuilder addSugarSpoons(int value){
            this.drink.noSugarSpoons = value;
            return this;
        }

        public DrinkBuilder addToppings(Toppings toppings){
            this.drink.toppings = toppings;
            return this;
        }

        public DrinkCustomization build(){
            return this.drink;
        }


    }

    @Override
    public String toString() {
        return "DrinkCustomization{" +
                "size=" + size +
                ", type=" + type +
                ", milk=" + milk +
                ", noSugarSpoons=" + noSugarSpoons +
                ", toppings=" + toppings +
                '}';
    }
}
