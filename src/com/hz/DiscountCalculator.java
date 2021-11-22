package com.hz;

import discounts.BlackFridayDiscount;
import discounts.ChristmasEveDiscount;
import discounts.DiscountStrategy;
import discounts.RegularDiscount;
import products.Product;

public class DiscountCalculator {

    private Customer customer;
    private DiscountStrategy discountStrategy;

    public DiscountCalculator(Customer customer, SalesAction salesAction) {
        this.customer = customer;
        if (salesAction == SalesAction.BlackFriday) {
            this.discountStrategy = new BlackFridayDiscount();
        } else if (salesAction == SalesAction.ChristmasEve) {
            this.discountStrategy = new ChristmasEveDiscount();
        } else if (salesAction == SalesAction.NoAction) {
            this.discountStrategy = new RegularDiscount();
        }
    }

    public double getDiscount(Product product, int index) {
        double discount = 1 - this.discountStrategy.getDiscount(this.customer, product, index);
        return discount;
    }
}
