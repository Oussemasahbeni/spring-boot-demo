package com.oussema.springDemo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBStudentService implements  StudentService {

    private final StudentRepository repo;

    public DBStudentService(StudentRepository repo) {
        this.repo = repo;
    }


    @Override
    public Student save(Student student) {
        return repo.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public void deleteByEmail(String email) {
            repo.deleteByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return repo.findAll();
    }
}
