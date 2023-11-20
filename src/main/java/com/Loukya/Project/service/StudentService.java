package com.Loukya.Project.service;

import com.Loukya.Project.model.Student;
import com.Loukya.Project.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public boolean addStudent(Student student) {
        return studentRepo.save(student) != null ? true : false;
    }

    public List <Student> getAllStudents()
    {
        return studentRepo.findAll();
    }

    public Optional<Student> getById(int id)
    {
        return studentRepo.findById(id);
    }
}
