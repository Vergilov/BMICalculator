package com.vergilov;

import java.util.List;

public class Diet extends HealthyCalculator {
    private List<Product> productList;

    public Diet(Person person, String activity, List<Product> productList) {
        super(person, activity);
        this.productList = productList;
    }

    public void meal() {
        System.out.println("Breakfast should have more Fat/Protein than Carbohydrates!");
    }

    public List<Product> getProductList() {
        return productList;
    }
}
