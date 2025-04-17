package com.example.studentfees.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PART_TIME")
public class PartTimeStudent extends Student {

    private int attendedHours;

    public PartTimeStudent() {}
    public PartTimeStudent(String regdNo, String name, int attendedHours) {
        super(regdNo, name);
        this.attendedHours = attendedHours;
    }

    @Override
    public double calculateFee() {
        return attendedHours * 50.0;
    }
}
