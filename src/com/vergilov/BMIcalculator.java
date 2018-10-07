package com.vergilov;

public class BMIcalculator extends HealthyCalculator {

    public BMIcalculator(Person person1,String activity) {
        super(activity,person1);
    }

    public double calculateBMI() {
        double weight = getPerson().getBodySize().getWeight();
        double height = getPerson().getBodySize().getHeight();
        return resultTwoDecimalPlaces(weight / heightToMeterPowerTwo(height));
    }
}
