package ro.ase.csie.cts.iany.almasanu.AS.builder;

import ro.ase.csie.cts.iany.almasanu.AS.Enums.Type;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Milk;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Size;

public class DrinkCustomization {
    private Size size;
    private Type type;
    private Milk milk;
    int noSugarSpoons;
    int noToppings;

    private DrinkCustomization(){

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

    public int getNoSugarSpoons() {
        return noSugarSpoons;
    }

    public int getNoToppings() {
        return noToppings;
    }

    public static class DrinkBuilder{

        DrinkCustomization drink;

        public DrinkBuilder(){
            this.drink = new DrinkCustomization();
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

        public DrinkBuilder addNoToppings(int value){
            this.drink.noToppings = value;
            return this;
        }

        public DrinkCustomization build(){
            return this.drink;
        }


    }


}
