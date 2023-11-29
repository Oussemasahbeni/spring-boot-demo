package com.oussema.springDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

    Student save(Student student);
    Student findByEmail(String email);
    void deleteByEmail(String email);
    Student update(Student student);
    List<Student> findAllStudents();

}
