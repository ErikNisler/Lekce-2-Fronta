package com.company;

public enum Request {
    URGENT("Urgentní"),
    ORD_MEDICAMENTS("Objednání léků"),
    SICKNESS("Nemoc"),
    PREVENTION("Prevence");
    private String description;

    Request(String description){
        this.description = description;
    }

    public String toString(){
        return description;
    }
}
