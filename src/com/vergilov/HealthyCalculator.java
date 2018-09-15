package com.vergilov;

public class HealthyCalculator {
    private Person person;

    public HealthyCalculator(Person person) {
        this.person = person;
    }

    public double calculateBMI() {
        double weight = this.person.getWeight();
        double height = this.person.getHeight();
        return weight / heightToMeterPowerTwo(height);
    }

    private double heightToMeterPowerTwo(double height) {
        return  (height / 100) * (height / 100);
    }


    public double calculateProtein() {
        return bmr() * 0.2;  //20% protein daily

    }

    public double calculatecarbohydrates() {
        return bmr() * 0.5;  //50% carbo daily
    }

    public double calculateFat() {
        return bmr() * 0.3;  //30% protein daily
    }

    public void resultTwoDecimalPlaces(double input) {
        System.out.print("Result two decimal places: ");
        System.out.printf("%.2f", input);
        System.out.println("");
    }

    public double bmr() {
        double formula;
        if (this.person.getGender().equalsIgnoreCase("Women")) {
            formula = 655 + (9.6 * this.person.getWeight()) + (1.8 * this.person.getHeight()) - (4.7 * this.person.getAge());
        } else if (this.person.getGender().equalsIgnoreCase("Men")) {
            formula = 66 + (13.7 * this.person.getWeight()) + (5 * this.person.getHeight()) - (6.8 * this.person.getAge());
        } else {
            System.out.println("Wrong Gender!");
            return -1.0;
        }

        return formula;
    }

}
