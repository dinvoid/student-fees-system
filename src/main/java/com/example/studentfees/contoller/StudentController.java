package com.example.studentfees.controller;

import com.example.studentfees.dto.StudentRegistrationRequest;
import com.example.studentfees.dto.StudentResponse;
import com.example.studentfees.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{regdNo}/fees")
    public double getFees(@PathVariable String regdNo) {
        return service.getStudentFees(regdNo);
    }


    @PostMapping("/register")
    public ResponseEntity<StudentResponse> registerStudent(@Valid @RequestBody StudentRegistrationRequest request) {
        StudentResponse response = service.registerStudent(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
