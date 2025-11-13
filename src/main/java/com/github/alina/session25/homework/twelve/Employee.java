package com.github.alina.session25.homework.twelve;

public class Employee {
    private String name;
    private String department;
    private Double salary;

    public Employee(String name, String department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }
}
