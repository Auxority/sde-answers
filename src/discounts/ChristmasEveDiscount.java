package discounts;

import com.hz.Customer;

import products.Product;

public class ChristmasEveDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(Customer customer, Product product, int index) {
        boolean isFirstProduct = index == 0;
        return isFirstProduct ? 0.20 : 0.125;
    }
}
