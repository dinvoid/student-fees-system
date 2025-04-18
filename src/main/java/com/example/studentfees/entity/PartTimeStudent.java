package com.example.studentfees.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PART_TIME")
public class PartTimeStudent extends Student {

    private int attendedHours;

    public PartTimeStudent() {}
    public PartTimeStudent(String regdNo, String name,int age, int attendedHours) {
        super(regdNo, name,age);
        this.attendedHours = attendedHours;
    }
    public int getAttendedHours() {
        return attendedHours;
    }

    // Setter for attendedHours
    public void setAttendedHours(int attendedHours) {
        this.attendedHours = attendedHours;
    }

    @Override
    public double calculateFee() {
        return attendedHours * 50.0;
    }
}
