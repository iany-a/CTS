package ro.ase.csie.cts.iany.almasanu.AS.builder;

import ro.ase.csie.cts.iany.almasanu.AS.Enums.Milk;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Size;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Type;

public class Main {
    public static void main(String[] args) {
        DrinkCustomization drink1 = new DrinkCustomization.DrinkBuilder()
                .addSize(Size.Large)
                .addMilk(Milk.Almond)
                .addNoToppings(3)
                .build();

        DrinkCustomization drink2 = new DrinkCustomization.DrinkBuilder()
                .addType(Type.Cappuccino)
                .addSugarSpoons(0)
                .addNoToppings(0)
                .build();

        DrinkCustomization drink3 = new DrinkCustomization.DrinkBuilder()
                .addMilk(Milk.Skimmed)
                .addNoToppings(2)
                .build();


        System.out.println(drink3.getMilk());

        //drink3.addSize(Size.Medium); - not going to work once the object is created




    }
}
