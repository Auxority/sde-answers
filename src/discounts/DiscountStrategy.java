package discounts;

import com.hz.Customer;

import products.Product;

public interface DiscountStrategy {
    public double getDiscount(Customer customer, Product product, int index);
}