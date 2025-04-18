package com.example.studentfees.service;

import com.example.studentfees.dto.StudentRegistrationRequest;
import com.example.studentfees.dto.StudentResponse;
import com.example.studentfees.entity.GraduateStudent;
import com.example.studentfees.entity.PartTimeStudent;
import com.example.studentfees.entity.Student;
import com.example.studentfees.entity.UndergraduateStudent;
import com.example.studentfees.exceptoion.InvalidStudentTypeException;
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
    public StudentResponse registerStudent(StudentRegistrationRequest request) {
        Student student = createStudent(request);
        studentRepo.save(student);
        return new StudentResponse(student.getRegdNo(), student.getName(), student.calculateFee());
    }
    private Student createStudent(StudentRegistrationRequest request) {
        switch (request.getType().toUpperCase()) {
            case "UNDERGRADUATE":
                return new UndergraduateStudent(request.getRegdNo(), request.getName(), request.getAge());
            case "GRADUATE":
                return new GraduateStudent(request.getRegdNo(), request.getName(), request.getAge());
            case "PARTTIME":
                return new PartTimeStudent(request.getRegdNo(), request.getName(), request.getAge());
            default:
                throw new InvalidStudentTypeException("Invalid student type");
        }
    }
}
