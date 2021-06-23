package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderList {
    ArrayList<Patient> listOfPatients = new ArrayList<>();

    private LocalDate dateOfOrder;
    private String issue;
    private Request request;
    private Patient patient;
    private Order order;

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

    public void add(Patient patient){
        listOfPatients.add(patient);
    }

    public Patient get(int index){
        return listOfPatients.get(index);
    }

    public int size(){
        return listOfPatients.size();
    }

    public String ordering(Patient patient, LocalDate dateOfOrder, String issue, Request request){
        this.dateOfOrder = dateOfOrder;
        this.issue = issue;
        this.request = request;
        listOfPatients.add(patient);
        Order order = new Order(dateOfOrder,issue,request);
        return order.getInfo();

    }

    public String invocation(Integer input) {
        HashMap<Integer, String> invocation = new HashMap<>();
        for (Patient p : listOfPatients) {
            Integer id = p.getId();
            String name = p.getName();
            invocation.put(id, name);
        }
        String name = invocation.get(input);
        return name;
    }
}
