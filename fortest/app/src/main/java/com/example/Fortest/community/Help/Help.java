package com.example.Fortest.community.Help;

public class Help {
    private String animalName;
    private String animalType;
    private String animalQuestion;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalQuestion() {
        return animalQuestion;
    }

    public void setAnimalQuestion(String animalQuestion) {
        this.animalQuestion = animalQuestion;
    }

    public Help(String animalName, String animalType, String animalQuestion) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalQuestion = animalQuestion;
    }
}
