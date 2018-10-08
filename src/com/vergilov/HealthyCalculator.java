package com.vergilov;


public class HealthyCalculator {
    private String activity;
    private Person person;


    @FunctionalInterface
    public interface Multiply {
        double multiply(Double one, Double two);
    }

    public HealthyCalculator(String activity,Person person) {
        this.activity = activity;
        this.person=person;
    }


    public double heightToMeterPowerTwo(double height) {
        Multiply multiple = (one, two) -> (one / 100) * (two / 100);
        return multiple.multiply(height, height);
    }


    public double resultTwoDecimalPlaces(double input) {
        return (double) Math.round(input * 100) / 100;
    }

    public boolean isWomen() {
        boolean isWomen = false;
        if (this.person.getGender().equalsIgnoreCase("Women")) {
            isWomen = true;
        }
        return isWomen;
    }

    public boolean isMen() {
        boolean isMen = false;
        if (this.person.getGender().equalsIgnoreCase("Men")) {
            isMen = true;
        }
        return isMen;
    }

    public boolean isLight() {
        boolean isLight = false;
        if (this.getActivity().equalsIgnoreCase("Light")) {
            isLight = true;
        }
        return isLight;
    }

    public boolean isModerate() {
        boolean isModerate = false;
        if (this.getActivity().equalsIgnoreCase("Moderate")) {
            isModerate = true;
        }
        return isModerate;
    }

    public boolean isVigorous() {
        boolean isVigorous = false;
        if (this.getActivity().equalsIgnoreCase("Vigorous")) {
            isVigorous = true;
        }
        return isVigorous;
    }

    public boolean isEctomorph() {
        boolean isEctomorph = false;
        if (getPerson().getBodyType().equalsIgnoreCase("Ectomorph")) {
            isEctomorph = true;
        }
        return isEctomorph;
    }

    public boolean isEndomorph() {
        boolean isEndomorph = false;
        if (getPerson().getBodyType().equalsIgnoreCase("Endomorph")) {
            isEndomorph = true;
        }
        return isEndomorph;
    }

    public boolean isMesomorph() {
        boolean isMesomorph = false;
        if (getPerson().getBodyType().equalsIgnoreCase("Mesomorph")) {
            isMesomorph = true;
        }
        return isMesomorph;
    }

    public String getActivity() {
        return activity;
    }

    public Person getPerson() {
        return person;
    }

}
