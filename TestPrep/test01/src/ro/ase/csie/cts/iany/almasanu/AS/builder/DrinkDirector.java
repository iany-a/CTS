package ro.ase.csie.cts.iany.almasanu.AS.builder;

import ro.ase.csie.cts.iany.almasanu.AS.Enums.Milk;
import ro.ase.csie.cts.iany.almasanu.AS.Enums.Size;

public class DrinkDirector {
    public static DrinkCustomization createDrinkWithDirector(){
        return new DrinkCustomization.DrinkBuilder("LatteDirector").addMilk(Milk.Whole).build();
    }

    public static DrinkCustomization createDrinkWithDirector2(){
        return new DrinkCustomization.DrinkBuilder("Bland").addSize(Size.Medium).addSugarSpoons(0).build();
    }
}
