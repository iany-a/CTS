package ro.ase.cts.csie.stage3;

public class ProductDiscount {
    public static final int ACCOUNT_AGE_DISCOUNT_LIMIT = 10;
    public static final float MAX_ACCOUNT_DISCOUNT = 0.15f;

    public static float getAccountDiscount(int accountAgeInYears){

        return (accountAgeInYears > ACCOUNT_AGE_DISCOUNT_LIMIT) ? MAX_ACCOUNT_DISCOUNT : (float) accountAgeInYears /100;

    }

    public static float getDiscountValue(float price, float discountAbsoluteValue){
        return price * discountAbsoluteValue;
    }

    //don't use this
//    public static float getPriceWithDiscount(float price, float discountValue){
//        return price - discountValue;
//    }

    public static float getPriceWithDiscount(float price, float discountAbsoluteValue){
        return price - getDiscountValue(price, discountAbsoluteValue);
    }

    public static float getPriceWithAllDiscounts(float price, ProductType type, float accountDiscount){
        return getPriceWithDiscount(price, type.getDiscount()) * (1-accountDiscount);
    }

    public float getFinalPriceWithDiscount(ProductType productType, float initialPrice, int userAccountAge)
    {


        float accountDiscount = productType == ProductType.NEW ? 0 : getAccountDiscount(userAccountAge);
        return getPriceWithAllDiscounts(initialPrice, productType, accountDiscount);

//        float accountDiscount = getAccountDiscount(userAccountAge);
//        if(productType == ProductType.NEW){ //ONLY if this is a new product type, there is no discount to be applied
//            return initialPrice;
//        }
//        else {
//            return getPriceWithAllDiscounts(initialPrice, productType, accountDiscount);
//        }
    }




}