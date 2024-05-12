package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// Business Layer
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Joel", "joelkong2001@gmail.com", LocalDate.of(2001, Month.NOVEMBER, 16), 22));
    }
}
