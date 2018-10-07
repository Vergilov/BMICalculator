package com.vergilov;

public class BMRcalculator extends HealthyCalculator {

    public BMRcalculator(String activity,Person person) {
        super(activity,person);
    }

    public double calculateBMR() {
        Multiply multiple = (one, two) -> resultTwoDecimalPlaces(one * two);
        double bmr = formulaForGender();
        bmr += whatBodyType();
        return multiple.multiply(bmr, activities());
    }

    private double formulaForGender() {
        double formula;
        if (isWomen()) {
            formula = 655 + (9.6 * getPerson().getBodySize().getWeight()) + (1.8 * getPerson().getBodySize().getHeight()) - (4.7 * getPerson().getAge());
        } else if (isMen()) {
            formula = 66 + (13.7 * getPerson().getBodySize().getWeight()) + (5 * getPerson().getBodySize().getHeight()) - (6.8 * getPerson().getAge());
        } else {
            System.out.println("Wrong Gender!");
            return -1.0;
        }
        return formula;
    }

    private double whatBodyType() {
        double add;
        if (isEctomorph()) {
            add = 800;
        } else if (isMesomorph()) {
            add = 450;
        } else if (isEndomorph()) {
            add = 300;
        } else {
            System.out.println("Wrong bodytype!");
            return -1.0;
        }
        return add;
    }

    private double activities() {
        double multiply = (-1.0);
        if (!(isLight() || isModerate() || isVigorous())) {
            System.out.println("WRONG ACTIVITY");
        } else if (isLight()) {
            multiply = 1.53;
        } else if (isModerate()) {
            multiply = 1.76;
        } else {
            multiply = 2.25;
        }
        return multiply;
    }

    private boolean isLight() {
        boolean isLight = false;
        if (this.getActivity().equalsIgnoreCase("Light")) {
            isLight = true;
        }
        return isLight;
    }

    private boolean isModerate() {
        boolean isModerate = false;
        if (this.getActivity().equalsIgnoreCase("Moderate")) {
            isModerate = true;
        }
        return isModerate;
    }

    private boolean isVigorous() {
        boolean isVigorous = false;
        if (this.getActivity().equalsIgnoreCase("Vigorous")) {
            isVigorous = true;
        }
        return isVigorous;
    }




    private boolean isEctomorph() {
        boolean isEctomorph = false;
        if (getPerson().getBodyType().equalsIgnoreCase("Ectomorph")) {
            isEctomorph = true;
        }
        return isEctomorph;
    }

    private boolean isEndomorph() {
        boolean isEndomorph = false;
        if (getPerson().getBodyType().equalsIgnoreCase("Endomorph")) {
            isEndomorph = true;
        }
        return isEndomorph;
    }

    private boolean isMesomorph() {
        boolean isMesomorph = false;
        if (getPerson().getBodyType().equalsIgnoreCase("Mesomorph")) {
            isMesomorph = true;
        }
        return isMesomorph;
    }
}
