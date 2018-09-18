package com.vergilov;

import java.util.List;

public class Diet extends HealthyCalculator {
private List<Product> product;

    public Diet(String activity,List<Product> product) {
        super(activity);
        this.product=product;
    }

    public void meal() {
        System.out.println("Breakfast should have more Fat/Protein than Carbohydrates!");
    }




}
