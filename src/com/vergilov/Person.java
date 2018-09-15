package com.vergilov;

public class Person {
    private int height;
    private int weight;
    private int year;
    private BodyType bodyType;
    private String gender;


    public Person(int height, int weight, String gender,BodyType bodyType,int year) {
        this.height = height;
        this.weight = weight;
        this.gender=gender;
        this.bodyType=bodyType;
        this.year=year;
    }




    //Getters

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public String getGender() {
        return gender;
    }
}
