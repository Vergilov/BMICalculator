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

    public double nutrients() {
        double nutries = getFat() + getCarbohydrates() + getProtein();
        System.out.println(this.getName() + ": " + nutries + " g");
        return nutries;
    }


    public boolean equals(Product product1) {
        if (this.getName() == product1.getName() &&this.getProtein() == product1.getProtein()&&this.getCarbohydrates() == product1.getCarbohydrates()&&this.getFat() == product1.getFat()) return true;
        if (!(product1 instanceof Product)) return false;

        Product product = (Product) product1;

        if (Double.compare(product.carbohydrates, carbohydrates) != 0) return false;
        if (Double.compare(product.protein, protein) != 0) return false;
        if (Double.compare(product.fat, fat) != 0) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(carbohydrates);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(protein);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
