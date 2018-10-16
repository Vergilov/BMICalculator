package com.vergilov;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        ProductList<Product> productList = new ProductList<>();
        BodySize bodysize = new BodySize(170, 80);
        Person maciek = new Person(bodysize, "Mesomorph", "Women", 28);
        Diet calculator = new Diet("Moderate",maciek ,productList);

        Product piers = new Product("Piers z kuraka", 12.0, 28.0, 7.0);
        Product sandwich = new Product("Kanapeczka", 11.0, 8.0, 4.0);
        Product hamburger = new Product("Hamburger", 22.0, 28.0, 19.0);
        Product cola = new Product("Cola Zero", 0.5, 0.0, 0.0);
        Product bread = new Product("Pieczywo Biale", 12.0, 18.0, 4.0);

        productList.add(piers);
        productList.add(sandwich);
        productList.add(hamburger);
        productList.add(sandwich);
        productList.add(cola);
        productList.add(bread);
        productList.add(cola);
        //run();
        productList.printProducts();
        productList.fullMacro();
        calculator.summaryMeal();
    }

    private static Person createObjects() {
        System.out.println("Welcome to the HEALTHY CALCULATOR! \n" +
                "Follow instruction");
        System.out.print("You Height: ");
        int height = in.nextInt();
        System.out.print("You Weight: ");
        int weight = in.nextInt();
        BodySize bodysize = new BodySize(height, weight);
        System.out.print("What is you bodytype? Choose between Ectomorph, Mesomorph, Endomorph: ");
        String bodytype = in.next();

        if (!(bodytype.equalsIgnoreCase("Endomorph") || bodytype.equalsIgnoreCase("Mesomorph")
                || bodytype.equalsIgnoreCase("Ectomorph"))) {
            System.out.println("Please choose between Endomorph/Mesomorph/Ectomorph");
        }
        System.out.print("You Gender (Men/Women): ");
        String gender = in.next();
        System.out.print("You Age: ");
        int age = in.nextInt();
        return new Person(bodysize, bodytype, gender, age);
    }

    private static void run() {
        boolean run = true;
        Person person = createObjects();
        System.out.println("You sport activity: Choose between Light/Moderate/Vigorous: ");
        String activity = in.next();
        while (run) {
            options();
            int action = in.nextInt();
            switch (action) {
                case 1:
                    BMRCalculator bmrCalculator = new BMRCalculator(activity, person);
                    System.out.println("BMR: " + bmrCalculator.calculateBMR());
                    break;
                case 2:
                    FatCalculator fatCalculator = new FatCalculator(person, activity);
                    System.out.println("BODYFAT: " + fatCalculator.getPercentageBodyFat());
                    break;
                case 3:
                    BMIcalculator bmicalculator = new BMIcalculator(person, activity);
                    System.out.println("BMI: " + bmicalculator.calculateBMI());
                    break;
                case 0:
                    run = false;
                    break;
            }
        }
    }

    private static void options() {
        System.out.println("Choose options: \n" +
                "1: Calculate BMR \n" +
                "2: Calculate Body Fat \n" +
                "3: Calculate BMI \n" +
                "0: Quit");
    }
}

