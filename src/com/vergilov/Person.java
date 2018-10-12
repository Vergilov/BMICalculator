package com.vergilov;

public class Person {
    private BodySize bodySize;
    private int age;
    private String bodyType;
    private String gender;


    public Person(BodySize bodySize, String bodyType, String gender, int age) {
        this.bodyType = bodyType;
        this.bodySize = bodySize;

        if (!(gender.equalsIgnoreCase("Men") || bodyType.equalsIgnoreCase("Women"))) {
            System.out.println("Please choose between Men/Women");
        } else {
            this.gender = gender;
        }

        if (age < 0) {
            System.out.println("Age cant be negative!");
        } else {
            this.age = age;
        }
    }

    public BodySize getBodySize() {
        return bodySize;
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

}
