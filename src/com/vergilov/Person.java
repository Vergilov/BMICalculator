package com.vergilov;

public class Person {
    private int height;
    private int weight;
    private int age;
    private String gender;


    public Person(int height, int weight, String gender, int age) {
        this.height = height;
        this.weight = weight;
        this.gender=gender;
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
}
