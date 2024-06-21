package com.linkedlist;


public class Employee {

    private int id;
    private int department;
    private String name;

    public Employee(int id, int department, String name) {
        this.id = id;
        this.department = department;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
