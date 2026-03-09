package ro.ase.cts.csie.stage4;

import ro.ase.cts.csie.stage4.marketing.EasterStrategy;
import ro.ase.cts.csie.stage4.marketing.IMarketingStrategy;

public class Test {
    public static void main(String[] args) {
        IMarketingStrategy currentStrategy = new EasterStrategy();

        ProductDiscount discountService = new ProductDiscount(currentStrategy);

        float initialPrice = 1000;
        int accountAge = 5;

        float finalPrice = discountService.getFinalPriceWithDiscount(ProductType.GOLD, initialPrice, accountAge);

        System.out.println("Final price: " + finalPrice);
    }
}
