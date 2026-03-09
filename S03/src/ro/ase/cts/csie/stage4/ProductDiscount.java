package ro.ase.cts.csie.stage4;

import ro.ase.cts.csie.stage4.marketing.IMarketingStrategy;

import static ro.ase.cts.csie.stage4.marketing.IMarketingStrategy.ACCOUNT_AGE_DISCOUNT_LIMIT;
import static ro.ase.cts.csie.stage4.marketing.IMarketingStrategy.MAX_ACCOUNT_DISCOUNT;

public class ProductDiscount {

    private IMarketingStrategy mkStrategy = null;

    //setter injection
    public void setMkStrategy(IMarketingStrategy strategy){
        this.mkStrategy = strategy;
    }

    //constructor injection
    public ProductDiscount(IMarketingStrategy strategy){
        this.mkStrategy = strategy;
    }

    public float getAccountDiscount(int accountAgeInYears){
        //callback to the marketing strategy
        return mkStrategy.getAccountDiscount(accountAgeInYears);
    }
//
//    public static float getDiscountValue(float price, float discountAbsoluteValue){
//        return price * discountAbsoluteValue;
//    }
//
//
//    public static float getPriceWithDiscount(float price, float discountAbsoluteValue){
//        return price - getDiscountValue(price, discountAbsoluteValue);
//    }

    public float getPriceWithAllDiscounts(float price, ProductType type, float accountDiscount){
        //call-back to the marketing strategy
        return mkStrategy.getPriceWithAllDiscounts(price, type, accountDiscount);
    }

    public float getFinalPriceWithDiscount(ProductType productType, float initialPrice, int userAccountAge) {
        float accountDiscount = productType == ProductType.NEW ? 0 : getAccountDiscount(userAccountAge);
        return getPriceWithAllDiscounts(initialPrice, productType, accountDiscount);
    }

}