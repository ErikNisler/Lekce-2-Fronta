package com.company;

import java.time.LocalDate;

public class Order {

    private LocalDate dateOfOrder;
    private String issue;
    private Request request;

    public Order(LocalDate dateOfOrder, String issue, Request request) {
        this.dateOfOrder = dateOfOrder;
        this.issue = issue;
        this.request = request;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getInfo(){
        return getDateOfOrder()+", "+getIssue()+", "+getRequest();
    }
}
