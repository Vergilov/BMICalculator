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

    public double nutriesToCalories(){
        System.out.println("Calories of "+getName());
        double fatCalories=this.fat*9.0;
        System.out.println("Fat: "+fatCalories);
        double carbohydratesCalories=this.carbohydrantes*4.0;
        System.out.println("Carbo: "+carbohydratesCalories);
        double proteinCalories=this.protein*4.0;
        System.out.println("Protein: "+proteinCalories);

        return proteinCalories+fatCalories+carbohydratesCalories;
    }
}
