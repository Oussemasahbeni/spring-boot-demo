package com.oussema.springDemo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table (name="student")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String Firstname;
    private String Lastname;
    @Column (unique = true)
    private String email;
    @Transient
    private int age;

    private LocalDate dateofbirth;


    public Student(String firstname, String lastname, String email, int age, LocalDate dateofbirth) {
        Firstname = firstname;
        Lastname = lastname;
        this.email = email;
        this.age = age;
        this.dateofbirth = dateofbirth;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return Period.between(dateofbirth,LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }


}
