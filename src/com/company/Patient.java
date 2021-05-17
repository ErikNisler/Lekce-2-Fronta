package com.company;

import java.time.LocalDate;

public class Patient {
    private static int counter;
    private int id;
    //--
    private String name;
    private LocalDate dateOfBirth;
    private Sex sex;
    private String address;
    //Objednání - atributy
    private LocalDate dateOfOrder;
    private String issue;
    private Request request;

    public Patient(String name, LocalDate dateOfBirth, Sex sex, String address) {
        id = ++counter;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getAll(){
        return id+" "+getName()+", "+getDateOfBirth()+", "+getSex()+", "+getAddress();
    }

    public String getAllOrder(LocalDate dateOfOrder, String issue, Request request){
        this.dateOfOrder = dateOfOrder;
        this.issue = issue;
        this.request = request;
        return getDateOfOrder()+", "+getIssue()+", "+getRequest();
    }

}
