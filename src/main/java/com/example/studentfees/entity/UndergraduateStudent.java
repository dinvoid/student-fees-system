package com.example.studentfees.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("UNDERGRAD")
public class UndergraduateStudent extends Student {

    private int creditHours;

    public UndergraduateStudent() {}
    public UndergraduateStudent(String regdNo, String name, int creditHours) {
        super(regdNo, name);
        this.creditHours = creditHours;
    }

    @Override
    public double calculateFee() {
        return creditHours * 100.0;
    }
}
