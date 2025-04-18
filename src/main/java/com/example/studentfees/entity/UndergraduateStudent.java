package com.example.studentfees.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("UNDERGRAD")
public class UndergraduateStudent extends Student {

    private int creditHours;

    // Default constructor
    public UndergraduateStudent() {}

    // Constructor with parameters
    public UndergraduateStudent(String regdNo, String name, int age, int creditHours) {
        super(regdNo, name, age);
        this.creditHours = creditHours;
    }

    // Getter for creditHours
    public int getCreditHours() {
        return creditHours;
    }

    // Setter for creditHours
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public double calculateFee() {
        return creditHours * 100.0;
    }
}
