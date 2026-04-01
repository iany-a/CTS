package designpatterns.builder;

public class DrinkCustomization extends AbstractDrink {

    private Size size;
    private Type type;
    private Milk milk;
    private int noSugarSpoons;
    private String toppings;

    public static class Builder {
        DrinkCustomization drinkCustomization;

        public Builder(String name){
            this.drinkCustomization = new DrinkCustomization(name);
        }

        public Builder addSize(Size size){
            this.drinkCustomization.size = size;
            return this;
        }

        public Builder addType(Type type){
            this.drinkCustomization.type = type;
            return this;
        }

        public Builder addMilk(Milk milk){
            this.drinkCustomization.milk = milk;
            return this;
        }

        public Builder addNoSugarSpoons(int noSugarSpoons){
            this.drinkCustomization.noSugarSpoons = noSugarSpoons;
            return this;
        }

        public Builder addToppings(String toppings){
            this.drinkCustomization.toppings = toppings;
            return this;
        }


        public DrinkCustomization build(){
            return this.drinkCustomization;
        }
    }






    protected DrinkCustomization(String name) {
        super(name);
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
        return "Toppings: " + this.toppings;
    }

    @Override
    public String toString() {
        return "DrinkCustomization{" +
                "size=" + size +
                ", type=" + type +
                ", milk=" + milk +
                ", noSugarSpoons=" + noSugarSpoons +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
