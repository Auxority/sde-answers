package discounts;

import com.hz.Customer;
import com.hz.ShoppingCart;

import products.Product;

public class BlackFridayDiscount implements DiscountStrategy {
    private static int MAX_DISCOUNT = 80;

    @Override
    public double getDiscount(Customer customer, Product product, int index) {
        ShoppingCart cart = customer.getCart();
        double cartSize = cart.size();
        return Math.min(cartSize, BlackFridayDiscount.MAX_DISCOUNT) / 100;
    }
}
