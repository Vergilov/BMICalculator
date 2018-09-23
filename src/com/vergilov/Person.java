package com.vergilov;

public class Person {
    private BodySize bodySize;
    private int age;
    private String bodyType;
    private String gender;


    public Person(BodySize bodySize, String bodyType, String gender, int age) {
        this.bodyType = bodyType;
        this.gender = gender;
        this.age = age;
        this.bodySize=bodySize;
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
