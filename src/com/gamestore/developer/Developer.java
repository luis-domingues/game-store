package com.gamestore.developer;

public class Developer {
    private String nameDeveloper;

    public Developer() {
        this.nameDeveloper = "NoName";
    }

    public Developer(String nameDeveloper) {
        this.nameDeveloper = nameDeveloper;
    }

    public void setNameDeveloper(String nameDeveloper) {
        if (nameDeveloper.isBlank())
            return;
        this.nameDeveloper = nameDeveloper;
    }

    public String getNameDeveloper() {
        return nameDeveloper;
    }
}