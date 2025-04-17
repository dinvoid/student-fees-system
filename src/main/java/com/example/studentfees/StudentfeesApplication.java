package com.example.studentfees;

import com.example.studentfees.entity.*;
import com.example.studentfees.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentfeesApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(StudentfeesApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// Add sample students
		repo.save(new UndergraduateStudent("U001", "Alice", 18));
		repo.save(new GraduateStudent("G001", "Bob", 6));
		repo.save(new PartTimeStudent("P001", "Charlie", 12));
	}
}
