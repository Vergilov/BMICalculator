package com.vergilov;

public class BMIcalculator extends HealthyCalculator {
    private Person person;

    public BMIcalculator(Person person, String activity, Person person1) {
        super(person, activity);
        this.person = person1;
    }

    public double calculateBMI() {
        double weight = this.person.getWeight();
        double height = this.person.getHeight();
        return weight / heightToMeterPowerTwo(height);
    }
}
