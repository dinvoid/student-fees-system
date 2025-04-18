package com.example.studentfees.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "student_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Student {

    @Id
    private String regdNo;
    private String name;
    private int age;
    private String type; // "UNDERGRADUATE", "GRADUATE", or "PARTTIME"

   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }
    public Student() {}
    public Student(String regdNo, String name,int age) {
        this.regdNo = regdNo;
        this.name = name;
        this.age=age;
    }

    public abstract double calculateFee();

    public String getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(String regdNo) {
        this.regdNo = regdNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
