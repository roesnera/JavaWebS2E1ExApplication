package com.example.demo.service;


import com.example.demo.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service
@Component
public class StudentService {

    private List<Student> studentList;

    public StudentService(){
        studentList = new ArrayList<Student>();
        studentList.add(new Student("Adam", 1));
    }

    public List<Student> getStudentList(){
        return studentList;
    }
}
