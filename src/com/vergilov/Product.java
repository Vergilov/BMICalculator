package com.vergilov;

public class Product {
    private String name;
    private double carbohydrates;
    private double protein;
    private double fat;

    public Product(String name, double carbohydrates, double protein, double fat) {
        this.name = name;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public void printCaloriesOfProduct() {
        System.out.println("Calories of " + getName() + "!");
        double fatCalories = this.fat * 9.0;
        System.out.println("Fat: " + fatCalories);
        double carbohydratesCalories = this.carbohydrates * 4.0;
        System.out.println("Carbo: " + carbohydratesCalories);
        double proteinCalories = this.protein * 4.0;
        System.out.println("Protein: " + proteinCalories);
        double fullMacro = fatCalories + carbohydratesCalories + proteinCalories;
        System.out.println("Full macro=" + fullMacro);

    }

    public double nutries() {
        double nutries = getFat() + getCarbohydrates() + getProtein();
        System.out.println(this.getName() + ": " + nutries + " g");
        return nutries;
    }
}
