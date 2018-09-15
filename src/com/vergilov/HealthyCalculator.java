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


    public void resultTwoDecimalPlaces(double input) {
        System.out.print("Result two decimal places: ");
        System.out.printf("%.2f", input);
        System.out.println("");
    }

    private double bmr() {
        double formula;
        if (isWomen()) {
            formula = 655 + (9.6 * this.person.getWeight()) + (1.8 * this.person.getHeight()) - (4.7 * this.person.getAge());
        } else if (isMen()) {
            formula = 66 + (13.7 * this.person.getWeight()) + (5 * this.person.getHeight()) - (6.8 * this.person.getAge());
        } else {
            System.out.println("Wrong Gender!");
            return -1.0;
        }
        if(isEktomoph()){
            formula+=800;
        } else if(isMesomoph()){
            formula+=450;
        } else if(isEndomoph()){
            formula+=300;
        } else {
            System.out.println("Wrong bodytype!");
            return -1.0;
        }
        return formula;
    }

    private boolean isWomen(){
        if(this.person.getGender().equalsIgnoreCase("Women")){
            return true;
        }
        return false;
    }
    private boolean isMen(){
        if(this.person.getGender().equalsIgnoreCase("Men")){
            return true;
        }
        return false;
    }


    private boolean isEktomoph(){
        if(this.person.getBodyType().equalsIgnoreCase("Ektomorph")){
            return true;
        }
        return false;
    }
    private boolean isEndomoph(){
        if(this.person.getBodyType().equalsIgnoreCase("Endomorph")){
            return true;
        }
        return false;
    }
    private boolean isMesomoph(){
        if(this.person.getBodyType().equalsIgnoreCase("Mesomorph")){
            return true;
        }
        return false;
    }
    public void caloriesNeeded(){
        System.out.println("You need: "+bmr() +" Calories");
        System.out.println("FAT: "+calculateFat());
        System.out.println("Carbo: "+calculatecarbohydrates());
        System.out.println("Protein: "+calculateProtein());
    }

    private double calculateProtein() {
        return bmr() * 0.2;  //20% protein daily

    }

    private double calculatecarbohydrates() {
        return bmr() * 0.5;  //50% carbo daily
    }

    private double calculateFat() {
        return bmr() * 0.3;  //30% protein daily
    }

}
