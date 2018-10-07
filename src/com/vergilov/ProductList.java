package com.vergilov;

import java.util.ArrayList;
import java.util.List;

public class ProductList<T extends Product> {
    private List<T> listOfProduct;

    public ProductList() {
        listOfProduct = new ArrayList<>();
    }

    public List<T> getListOfProduct() {
        return listOfProduct;
    }

    public boolean add(T product) {
        boolean found = false;
        if (!listOfProduct.isEmpty()) {
            for (Product prod : listOfProduct) {
                if (product.equals(prod)) {
                    System.out.println("Product" + product.getName() + " already exist ->" + prod.getName());
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Adding-> " + product.getName());
            listOfProduct.add(product);
            found = true;
        }
        return found;
    }

    public void printProducts() {
        for (Product prod : listOfProduct) {
            System.out.println(prod.getName()
                    + "-> Carbo: " + prod.getCarbohydrates()
                    + " Protein: " + prod.getProtein() +
                    " Fat: " + prod.getFat());
        }
    }
}
