package com.example.studentfees.controller;

import com.example.studentfees.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{regdNo}/fees")
    public double getFees(@PathVariable String regdNo) {
        return service.getStudentFees(regdNo);
    }
}
