package com.example.Fortest.my;

public class Animal {
    private String animalName;
    private String animalSex;
    private String animalType;
    private String animalBirth;
    private String animalDescribe;

    public Animal(String animalName, String animalSex, String animalType, String animalBirth, String animalDescribe) {
        this.animalName = animalName;
        this.animalSex = animalSex;
        this.animalType = animalType;
        this.animalBirth = animalBirth;
        this.animalDescribe = animalDescribe;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalSex() {
        return animalSex;
    }

    public void setAnimalSex(String animalSex) {
        this.animalSex = animalSex;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalBirth() {
        return animalBirth;
    }

    public void setAnimalBirth(String animalBirth) {
        this.animalBirth = animalBirth;
    }

    public String getAnimalDescribe() {
        return animalDescribe;
    }

    public void setAnimalDescribe(String animalDescribe) {
        this.animalDescribe = animalDescribe;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalSex='" + animalSex + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalBirth='" + animalBirth + '\'' +
                ", animalDescribe='" + animalDescribe + '\'' +
                '}';
    }
}
