package com.oussema.springDemo.student;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student student) {
        return this.dao.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public void deleteByEmail(String email) {
    this.dao.deleteByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return this.dao.update(student);
    }

    @Override
    public List<Student> findAllStudents(){
        return this.dao.findAllStudents();
    }


}
