package com.vergilov;

public class Diet extends HealthyCalculator {
private ProductList<Product> productList;

    public Diet(ProductList<Product> productList,String activity) {
        super(activity);
        this.productList=productList;
    }


    public void meal() {
        System.out.println("Breakfast should have more Fat/Protein than Carbohydrates!");
        System.out.println("You can choose from: ");
        productList.printProducts();
    }

}
