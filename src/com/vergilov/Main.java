package com.vergilov;

public class Main {

    public static void main(String[] args) {
        Person maciek = new Person(170, 80, "Mesomorph","Women", 28);
        Product piers = new Product("Piers z kuraka",12.0,28.0,7.0);
        HealthyCalculator calculator = new HealthyCalculator(maciek);
        calculator.resultTwoDecimalPlaces(calculator.calculateBMI());
        calculator.caloriesNeeded();

        piers.nutriesToCalories();

    }
}
