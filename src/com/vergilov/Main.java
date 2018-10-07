package com.vergilov;

public class Main {

    public static void main(String[] args) {
        ProductList<Product> productList=new ProductList<>();
        //ACTIVITY 3 OPTIONS: LIGHT MODERATE VIGOROUS
        BodySize bodysize=new BodySize(170,80);
        Person maciek = new Person(bodysize,"Mesomorph", "Women", 28);
        FatCalculator fatCalculator=new FatCalculator(maciek,"Moderate");
        BMRcalculator bmRcalculator=new BMRcalculator("Light",maciek);

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
        productList.add(bread);
        System.out.println();

        productList.printProducts();
        System.out.println();


        System.out.println("BMR: "+bmRcalculator.calculateBMR());

        BMIcalculator bmi= new BMIcalculator(maciek,"Moderate");
        Diet calculator = new Diet("Moderate",maciek,productList);
        System.out.println();

        System.out.println("BODYFAT: "+fatCalculator.getPercentageBodyFat());
        System.out.println();

        System.out.println("BMI: "+bmi.calculateBMI());
        System.out.println();

        System.out.println("MEAL");
        calculator.meal();
    }
}
