package com.vergilov;

public class FatCalculator extends HealthyCalculator {
    private Person person;

    public FatCalculator(String activity, Person person) {
        super(activity);
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
