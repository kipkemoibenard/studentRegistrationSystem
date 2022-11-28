package com.kipkemoi.StudentSystem.service;

import com.kipkemoi.StudentSystem.model.Student;

import java.util.List;

public interface StudentService {
   public Student saveStudent(Student student);
   public List<Student> getAllStudents();
}
