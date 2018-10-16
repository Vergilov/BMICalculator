package com.vergilov;

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

    private ProductList<Product> prepareMeal(){
        ProductList<Product> meal = new ProductList<>();
        System.out.println("What position would like to add? pressing negative number exit loop");
        int action = in.nextInt();
        while (action<productList.getListOfProduct().size()&&action>=0){
            meal.add(productList.getListOfProduct().get(action));
            action = in.nextInt();
        }
        return meal;
    }

    public void summaryMeal(){
        ProductList<Product> meal = prepareMeal();
        meal.printProducts();
        for(int i=0;i<meal.getListOfProduct().size();i++){
            meal.getListOfProduct().get(i).printCaloriesOfProduct();
        }

    }

}
