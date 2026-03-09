package ro.ase.cts.csie.stage4;

//in JAVA an enum is a special class, meaning it has both methods and attributes
//enum contains a finite number of references to objects (in our case below, it has 4)
//constructors need to be declared as private inside enums
public enum ProductType {
    NEW(0), SILVER(0.1f), GOLD(0.25f), PLATINUM(0.35f);

    float discount;
    public float getDiscount(){
        return this.discount;
    }

    //to initialize any of the 4 objects "discount" field, you need to create a constructor
    private ProductType(float discount){
        this.discount = discount;
    }

}
