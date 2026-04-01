package com.tecsup.lab3.view;

import com.tecsup.lab3.model.Student;

public class StudentReport {
    
    public void printReport(Student student) {
        System.out.println("=== Student Report ===");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
    }
}