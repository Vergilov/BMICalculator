package com.vergilov;

public class CalculateNutriesForPerson extends BMRCalculator {

    public CalculateNutriesForPerson(String activity, Person person) {
        super(activity, person);
    }

    public void caloriesNeededDaily() {
        System.out.println("You need: " + calculateBMR() + " Calories:");
        System.out.println("Fat: " + calculateFatDaily());
        System.out.println("Carbo: " + calculatecarbohydratesDaily());
        System.out.println("Protein: " + calculateProteinDaily());
    }

    private double calculateProteinDaily() {
        return resultTwoDecimalPlaces(calculateBMR() * 0.2);  //20% protein daily
    }

    private double calculatecarbohydratesDaily() {
        return resultTwoDecimalPlaces(calculateBMR() * 0.5);  //50% carbo daily
    }

    private double calculateFatDaily() {
        return resultTwoDecimalPlaces(calculateBMR() * 0.3);  //30% protein daily
    }

}
