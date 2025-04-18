package com.example.studentfees;

import com.example.studentfees.entity.*;
import com.example.studentfees.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentfeesApplication   {

	@Autowired
	private StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(StudentfeesApplication.class, args);
	}
//	{
//		"regdNo": "3werw",
//			"name": "Alice",
//			"age": 192,
//			"creditHours":35,
//			"type": "UNDERGRADUATE"
//
//	}
//	@Override
//	public void run(String... args) {
//		// Add sample students
//		repo.save(new UndergraduateStudent("U001", "Alice", 67,18));
//		repo.save(new GraduateStudent("G001", "Bob", 6,33));
//			repo.save(new PartTimeStudent("P001", "Charlie", 12,9));
//		}
}
