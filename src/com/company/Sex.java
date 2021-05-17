package com.company;

public enum Sex {
    MALE("Muž"),
    FEMALE("Žena");
    private String description;

    private Sex(String description){
        this.description = description;
    }

    public String toString(){
        return description;
    }
}

