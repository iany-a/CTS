package ro.ase.csie.cts.iany.almasanu.AS.builder;

import ro.ase.csie.cts.iany.almasanu.AS.Enums.Milk;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Size;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Toppings;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Type;

public class Main {
    public static void main(String[] args) {
        DrinkCustomization drink1 = new DrinkCustomization.DrinkBuilder("Drink 1")
                .addSize(Size.Large)
                .addMilk(Milk.Almond)
                .addToppings(Toppings.Caramel)
                .build();

        DrinkCustomization drink2 = new DrinkCustomization.DrinkBuilder("Drink 2")
                .addType(Type.Cappuccino)
                .addSugarSpoons(0)
                .addToppings(Toppings.Chocolate)
                .build();

        DrinkCustomization drink3 = new DrinkCustomization.DrinkBuilder("Drink 3")
                .addMilk(Milk.Skimmed)
                .addToppings(Toppings.OreoCrumbs)
                .build();


        DrinkCustomization drink4 = DrinkDirector.createDrinkWithDirector();
        DrinkCustomization drink5 = DrinkDirector.createDrinkWithDirector2();


        System.out.println(drink3.getMilk());

        //drink3.addSize(Size.Medium); - not going to work once the object is created

        drink1.getDrinkDescription();
        drink2.getDrinkDescription();
        drink3.getDrinkDescription();
        drink4.getDrinkDescription();
        drink5.getDrinkDescription();


    }
}
