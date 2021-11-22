package discounts;

import com.hz.Customer;

import products.Product;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(Customer customer, Product product, int index) {
        return customer.isRegular() ? 0.15 : 0;
    }
}
