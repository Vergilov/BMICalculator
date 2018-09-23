package com.vergilov;

public class BMIcalculator extends HealthyCalculator {
    private Person person;

    public BMIcalculator(Person person1,String activity) {
        super(activity);
        this.person = person1;
    }

    public double calculateBMI() {
        double weight = this.person.getBodySize().getWeight();
        double height = this.person.getBodySize().getHeight();
        return resultTwoDecimalPlaces(weight / heightToMeterPowerTwo(height));
    }
}
