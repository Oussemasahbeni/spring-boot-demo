package com.oussema.springDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(new Student(
                        "Oussema",
                        "Sahbeni",
                        "oussemasahbeni300@gmail.com",
                        21,
                        LocalDate.now()
                ),new Student(
                        "wtvr",
                        "wtvr",
                        "oussemasahbeni300@gmail.com",
                        21,
                        LocalDate.now()
                )
        );
    }
}
