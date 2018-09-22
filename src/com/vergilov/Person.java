package com.vergilov;

public class Person {
    private int height;
    private int weight;
    private int waist;
    private int age;
    private String bodyType;
    private String gender;



    public Person(int height, int weight, int waist, String bodyType, String gender, int age) {
        this.height = height;
        this.weight = weight;
        this.waist=waist;
        this.bodyType = bodyType;
        this.gender = gender;
        this.age = age;
    }


    //Getters

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getWaist() {
        return waist;
    }
}
