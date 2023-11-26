package com.oussema.springDemo.student;

import java.time.LocalDate;

public class Student {
    private String Firstname;
    private String Lastname;
    private String email;
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
        return age;
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
