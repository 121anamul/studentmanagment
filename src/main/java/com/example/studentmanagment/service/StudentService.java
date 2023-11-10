package com.example.studentmanagment.service;

import com.example.studentmanagment.entity.Student;
import org.springframework.stereotype.Component;


import java.util.List;

public interface StudentService {
    List<Student>getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updatestudent(Student student);
    void deleteStudentByid(Long id);
}

