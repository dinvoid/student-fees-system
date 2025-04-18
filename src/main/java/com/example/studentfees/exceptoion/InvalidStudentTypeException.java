package com.example.studentfees.exceptoion;

public class InvalidStudentTypeException extends RuntimeException {
    public InvalidStudentTypeException(String message) {
        super(message);
    }
}
