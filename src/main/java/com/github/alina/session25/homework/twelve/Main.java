package com.github.alina.session25.homework.twelve;
//Given a list of employee objects with attributes:
// name, department, and salary; find the department with the highest total salary.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Alina", "IR", 2375738.00);
        Employee employee1 = new Employee("Alina", "POC", 2775738.00);
        Employee employee3 = new Employee("Alina", "TR", 6075738.00);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee3);
        var maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).get().getSalary();
       System.out.println(maxSalary);
    }
}
