package com.oussema.springDemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//  @RestController means that this class is a controller and it will handle HTTP requests
@RestController
//  @RequestMapping means that all the requests that start with /api/v1/students will be handled by this controller
@RequestMapping("/api/v1/students")
public class StudentController {
//  @GetMapping means that this method will handle GET requests
    @GetMapping
    public List<String> findAllStudents(){
        return List.of("Oussema", "Ahmed", "Mohamed");
    }
}
