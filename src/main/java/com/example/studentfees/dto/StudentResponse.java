package com.example.studentfees.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentResponse {
    private String regdNo;
    private String name;

    @JsonProperty("fee")
    private double fee; // JSON mapping of fee field

    public StudentResponse(String regdNo, String name, double fee) {
        this.regdNo = regdNo;
        this.name = name;
        this.fee = fee;
    }

    public String getRegdNo() { return regdNo; }
    public String getName() { return name; }
    public double getFee() { return fee; }
}
