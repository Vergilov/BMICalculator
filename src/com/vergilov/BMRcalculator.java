package com.vergilov;

public class BMRcalculator extends HealthyCalculator {
    private Person person;

    public BMRcalculator(Person person, String activity, Person person1) {
        super(person, activity);
        this.person = person1;
    }

    private double calculateBMR() {
        Multiply multiple = (one, two) -> resultTwoDecimalPlaces(one * two);
        double bmr = formulaForGender();
        bmr += whatBodyType();
        return multiple.multiply(bmr, activity());
    }

    private double formulaForGender() {
        double formula;
        if (isWomen()) {
            formula = 655 + (9.6 * this.person.getWeight()) + (1.8 * this.person.getHeight()) - (4.7 * this.person.getAge());
        } else if (isMen()) {
            formula = 66 + (13.7 * this.person.getWeight()) + (5 * this.person.getHeight()) - (6.8 * this.person.getAge());
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

    private double activity() {
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
        if (this.activity.equalsIgnoreCase("Light")) {
            isLight = true;
        }
        return isLight;
    }

    private boolean isModerate() {
        boolean isModerate = false;
        if (this.activity.equalsIgnoreCase("Moderate")) {
            isModerate = true;
        }
        return isModerate;
    }

    private boolean isVigorous() {
        boolean isVigorous = false;
        if (this.activity.equalsIgnoreCase("Vigorous")) {
            isVigorous = true;
        }
        return isVigorous;
    }

    private boolean isWomen() {
        boolean isWomen = false;
        if (this.person.getGender().equalsIgnoreCase("Women")) {
            isWomen = true;
        }
        return isWomen;
    }

    private boolean isMen() {
        boolean isMen = false;
        if (this.person.getGender().equalsIgnoreCase("Men")) {
            isMen = true;
        }
        return isMen;
    }


    private boolean isEctomorph() {
        boolean isEctomorph = false;
        if (this.person.getBodyType().equalsIgnoreCase("Ectomorph")) {
            isEctomorph = true;
        }
        return isEctomorph;
    }

    private boolean isEndomorph() {
        boolean isEndomorph = false;
        if (this.person.getBodyType().equalsIgnoreCase("Endomorph")) {
            isEndomorph = true;
        }
        return isEndomorph;
    }

    private boolean isMesomorph() {
        boolean isMesomorph = false;
        if (this.person.getBodyType().equalsIgnoreCase("Mesomorph")) {
            isMesomorph = true;
        }
        return isMesomorph;
    }
}
