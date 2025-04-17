package com.example.studentfees.service;

import com.example.studentfees.entity.Student;
import com.example.studentfees.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public double getStudentFees(String regdNo) {
        Student student = studentRepo.findById(regdNo)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        return student.calculateFee(); // Polymorphic call
    }
}
