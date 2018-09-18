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
        return (height / 100) * (height / 100);
    }


    public void resultTwoDecimalPlaces(double input) {
        System.out.print("Result two decimal places: ");
        System.out.printf("%.2f", input);
        System.out.println("");
    }

    private double calculateBMR() {
        double formula;
        if (isWomen()) {
            formula = 655 + (9.6 * this.person.getWeight()) + (1.8 * this.person.getHeight()) - (4.7 * this.person.getAge());
        } else if (isMen()) {
            formula = 66 + (13.7 * this.person.getWeight()) + (5 * this.person.getHeight()) - (6.8 * this.person.getAge());
        } else {
            System.out.println("Wrong Gender!");
            return -1.0;
        }
        if (isEctomorph()) {
            formula += 800;
        } else if (isMesomorph()) {
            formula += 450;
        } else if (isEndomorph()) {
            formula += 300;
        } else {
            System.out.println("Wrong bodytype!");
            return -1.0;
        }
        return formula;
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
        if (this.person.getBodyType().equalsIgnoreCase("Ektomorph")) {
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

    public void caloriesNeededDaily() {
        System.out.println("You need: " + calculateBMR() + " Calories");
        System.out.println("FAT: " + calculateFatDaily());
        System.out.println("Carbo: " + calculatecarbohydratesDaily());
        System.out.println("Protein: " + calculateProteinDaily());
    }

    private double calculateProteinDaily() {
        return calculateBMR() * 0.2;  //20% protein daily
    }

    private double calculatecarbohydratesDaily() {
        return calculateBMR() * 0.5;  //50% carbo daily
    }

    private double calculateFatDaily() {
        return calculateBMR() * 0.3;  //30% protein daily
    }

}
