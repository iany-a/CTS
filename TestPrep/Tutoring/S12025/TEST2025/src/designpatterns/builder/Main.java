package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        DrinkCustomization d1 = new DrinkCustomization.Builder("Drink1").addMilk(Milk.ALMOND).build();
        DrinkCustomization d2 = new DrinkCustomization.Builder("Drink2").addNoSugarSpoons(3).build();
        DrinkCustomization d3 = new DrinkCustomization.Builder("Drink3")
                .addType(Type.LATTE)
                .addSize(Size.LARGE)
                .addNoSugarSpoons(1)
                .addMilk(Milk.SOY)
                .build();

        DrinkCustomization d5 = new DrinkCustomization.Builder("Drink 5").build();

        //DrinkCustomization d4 = new DrinkCustomization();


        d2.getDrinkDescription();
        System.out.println(d2.getToppings());

        DrinkCustomization director1 = Director.createFromTemplate1();
        DrinkCustomization director2 = Director.createFromTemplate2();


        director1.getDrinkDescription();
        System.out.println(director2.getToppings());


    }
}
