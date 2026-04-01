package designpatterns.builder;

public class Director {
    public static DrinkCustomization createFromTemplate1(){
        return new DrinkCustomization.Builder("Template 1").addMilk(Milk.SKIMMED).build();
    }
    public static DrinkCustomization createFromTemplate2(){
        return new DrinkCustomization.Builder("Template 1").addToppings("Caramel").build();
    }
}
