package com.vergilov;

import java.util.List;

public class Diet extends HealthyCalculator {
    private List<Product> productList;

    public Diet(Person person, List<Product> productList) {
        super(person);
        this.productList = productList;
    }


    public void brekafast() {
        System.out.println("Breakfast should have more Fat/Protein than Carbohydrates!");
    }

    public void secondBreakfast(){

    }

    public void afterTraining(){

    }

    public void beforeTraining(){

    }

    public void afternoonMeal(){

    }


}
