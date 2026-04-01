package com.tecsup.lab3.controller;

import com.tecsup.lab3.model.Student;

public class StudentController {
    
    public Student getStudent(int id, String name, String email) {
        return new Student(id, name, email);
    }
    
    public void showStudent(Student student) {
        System.out.println("Student: " + student.getName());
        //jijija
    }
}