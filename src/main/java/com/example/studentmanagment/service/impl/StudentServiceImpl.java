package com.example.studentmanagment.service.impl;

import com.example.studentmanagment.entity.Student;
import com.example.studentmanagment.repository.StudentRepository;
import com.example.studentmanagment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {
@Autowired
private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updatestudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentByid(Long id) {
        studentRepository.deleteById(id);
    }
}
