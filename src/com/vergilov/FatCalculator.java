package com.vergilov;

public class FatCalculator extends BMIcalculator {

    public FatCalculator(Person person1, String activity) {
        super(person1, activity);
    }

    public double getPercentageBodyFat(){
        double fat;
        if(isMen()){
            fat=1.20*calculateBMI()+0.23*getPerson().getAge()-16.2;//1.20 × BMI + 0.23 × Age - 16.2 for male
        }else if(isWomen()){
            fat=1.20*calculateBMI()+0.23*getPerson().getAge()-5.4;//1.20 × BMI + 0.23 × Age - 5.4 for female
        } else{
            System.out.println("Wrong Gender");
            return -1;
        }
        return fat;
    }
}
