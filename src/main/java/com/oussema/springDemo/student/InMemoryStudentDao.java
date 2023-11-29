package com.oussema.springDemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {

    private  final  List<Student> students= new ArrayList<>();


    public Student save(Student student) {
         students.add(student);
         return student;
    }

    public Student findByEmail(String email) {
        return students.stream()
                .filter(student -> email.equals(student.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public void deleteByEmail(String email) {

        var student= findByEmail(email);
        if(student!=null){
            students.remove(student);
        }

    }

    public Student update(Student student){
        var studentIndex= IntStream.range(0,students.size())
                .filter(index -> students.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex!=-1){
            students.set(studentIndex,student);
                    return student;
        }
        return null;
    }

    public List<Student> findAllStudents(){
        return students;
    }
}
