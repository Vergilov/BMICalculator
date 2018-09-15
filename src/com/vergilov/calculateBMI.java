package com.vergilov;

public interface calculateBMI {
    private int calculateBMI(int weight,int height){
        int bmiForumla=(weight)/((height/10)*(height/10));
        return bmiForumla;
    }
}
