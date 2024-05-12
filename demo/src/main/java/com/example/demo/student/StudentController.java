package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // Get all students
    @GetMapping
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Joel", "joelkong2001@gmail.com", LocalDate.of(2001, Month.NOVEMBER, 16), 22));
    }
}
