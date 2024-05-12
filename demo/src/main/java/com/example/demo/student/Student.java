package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student {
    // Student attributes
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;
    private String name;
    private String email;
    private int age;
    private LocalDate dateOfBirth;

    // Default constructor
    public Student() {
    }

    // Constructor with all information
    public Student(Long id, String name, String email, LocalDate dateOfBirth, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    // Constructor where dob will generate id
    public Student(String name, String email, int age, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Convert to string
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
