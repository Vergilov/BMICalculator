package com.vergilov;

public class Main {

    public static void main(String[] args) {
        Person maciek = new Person(170, 80, "Women", 28);
        HealthyCalculator calculator = new HealthyCalculator(maciek);
        calculator.resultTwoDecimalPlaces(calculator.calculateBMI());
        calculator.bmr();
    }
}
