package com.example.studentfees.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "student_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Student {

    @Id
    private String regdNo;
    private String name;

    public Student() {}
    public Student(String regdNo, String name) {
        this.regdNo = regdNo;
        this.name = name;
    }

    public abstract double calculateFee();

    public String getRegdNo() { return regdNo; }
    public String getName() { return name; }
}
