package com.vergilov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diet extends HealthyCalculator {
private ProductList<Product> productList;
private Scanner in=new Scanner(System.in);

    public Diet(String activity, Person person, ProductList<Product> productList) {
        super(activity, person);
        this.productList = productList;
    }

    public void meal() {
        System.out.println("Breakfast should have more Fat/Protein than Carbohydrates!");
        System.out.println("You can choose from: ");
        productList.printProducts();
    }

    public List<Product> prepareMeal(){
        List<Product> meal = new ArrayList<>();
        return meal;

    }

}
