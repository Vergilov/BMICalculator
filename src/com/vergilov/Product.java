package com.vergilov;

public class Product {
    private String name;
    private double carbohydrantes;
    private double protein;
    private double fat;

    public Product(String name, double carbohydrantes, double protein, double fat) {
        this.name = name;
        this.carbohydrantes = carbohydrantes;
        this.protein = protein;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public double getCarbohydrantes() {
        return carbohydrantes;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }
}
