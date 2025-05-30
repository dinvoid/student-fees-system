package com.example.studentfees.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("GRADUATE")
public class GraduateStudent extends Student {

    private int units;

    public GraduateStudent() {}
    public GraduateStudent(String regdNo, String name, int units) {
        super(regdNo, name);
        this.units = units;
    }

    @Override
    public double calculateFee() {
        return units * 200.0;
    }
}
