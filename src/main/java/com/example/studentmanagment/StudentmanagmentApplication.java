package com.example.studentmanagment;

import com.example.studentmanagment.entity.Student;
import com.example.studentmanagment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagmentApplication.class, args);
	}
	@Autowired
private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student student1=new Student("anamul","haque","anamulhaque@gmail.com");
		studentRepository.save(student1);

	}
}
