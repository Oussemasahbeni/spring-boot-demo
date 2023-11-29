package com.oussema.springDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

//  @RestController means that this class is a controller and it will handle HTTP requests
@RestController
//  @RequestMapping means that all the requests that start with /api/v1/students will be handled by this controller
@RequestMapping("/api/v1/students")
public class StudentController {
    // @Autowired means that we want Spring to inject the StudentService object into this class

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.update(student);
    }
    @DeleteMapping("/{email}")
    public void deleteByEmail(@PathVariable String email){
         service.deleteByEmail(email);
    }
}
