package com.vergilov;

public class Main {

    public static void main(String[] args) {
        ProductList<Product> productList=new ProductList<Product>();

        Person maciek = new Person(170, 80, "Mesomorph", "Women", 28);

        Product piers = new Product("Piers z kuraka", 12.0, 28.0, 7.0);
        Product sandwich = new Product("Kanapeczkia", 11.0, 8.0, 4.0);
        Product hamburger = new Product("Hamburger", 22.0, 28.0, 19.0);
        Product cola = new Product("Cola Zero", 0.5, 0.0, 0.0);
        Product bread = new Product("Pieczywo Biale", 12.0, 18.0, 4.0);

        productList.add(piers);
        productList.add(sandwich);
        productList.add(hamburger);
        productList.add(cola);
        System.out.println("SECOND!");
        productList.add(cola);

        productList.printProducts();


        HealthyCalculator calculator = new Diet("Moderate",productList.getListOfProduct());
        HealthyCalculator bmi= new BMIcalculator(maciek,"Moderate");

        System.out.println(((BMIcalculator) bmi).calculateBMI());


        ((Diet) calculator).meal();


    }
}
