package com.example.Awsdemo.controller;

import com.example.Awsdemo.Repo.IStudentRepo;
import com.example.Awsdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentController {
    @Autowired
    IStudentRepo iStudentRepo;
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        iStudentRepo.save(student);
        return "Student added successfully!!";
    }
    @GetMapping("/getStudent")
    public List<Student> getStudent(){
        return iStudentRepo.findAll();

    }
}
