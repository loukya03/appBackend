package com.Loukya.Project.controller;

import com.Loukya.Project.model.Student;
import com.Loukya.Project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {

    @Autowired
    private StudentService studentService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addStudent")
    public boolean addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getById/{id}")
    public Optional<Student> getById(@PathVariable int id)
    {
        return studentService.getById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAllStudent")
    public List <Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

}
