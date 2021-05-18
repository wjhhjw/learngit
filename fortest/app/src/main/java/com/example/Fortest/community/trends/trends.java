package com.example.Fortest.community.trends;

public class trends {
    private String title;
    private String text;
    private String animalName;
    private String communityName;
    private String animalImage;

    public trends(String title, String text, String animalName, String communityName, String animalImage) {
        this.title = title;
        this.text = text;
        this.animalName = animalName;
        this.communityName = communityName;
        this.animalImage = animalImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getAnimalImage() {
        return animalImage;
    }

    public void setAnimalImage(String animalImage) {
        this.animalImage = animalImage;
    }
}
