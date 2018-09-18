package com.vergilov;

import java.util.ArrayList;
import java.util.List;

public class ProductList<T extends Product> {
    private List<T> productList;

    public ProductList() {
        productList = new ArrayList<>();
    }

    public boolean add(T product) {
        boolean found = false;
        if (!productList.isEmpty()) {
            for (Product prod : productList) {
                if (product.equals(prod)) {
                    System.out.println("Product" + product + " already exist ->" + prod.getName());
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Adding-> " + product.getName());
            productList.add(product);
            found = true;
        }
        return found;
    }

    public void printProducts() {
        for (Product prod : productList) {
            System.out.println(prod.getName()
                    + " Carbo:" + prod.getCarbohydrates()
                    + " Protein:" + prod.getProtein() +
                    " Fat:" + prod.getFat());
        }
    }

}
