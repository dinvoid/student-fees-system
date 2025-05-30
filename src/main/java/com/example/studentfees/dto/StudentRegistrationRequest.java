package com.example.studentfees.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StudentRegistrationRequest {

    @NotNull(message = "Registration number cannot be null")
    private String regdNo;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, message = "Name must be at least 2 characters long")
    private String name;

    private int age;

    @NotNull(message = "Student type cannot be null")
    private String type; // UNDERGRADUATE, GRADUATE, PARTTIME

    // Getters and setters
    public String getRegdNo() { return regdNo; }
    public void setRegdNo(String regdNo) { this.regdNo = regdNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
