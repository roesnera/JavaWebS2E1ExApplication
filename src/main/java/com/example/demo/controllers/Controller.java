package com.example.demo.controllers;


import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<Student> getData(){
        return studentService.getStudentList();
    }
}
