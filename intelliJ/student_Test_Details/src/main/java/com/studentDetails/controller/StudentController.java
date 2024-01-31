package com.studentDetails.controller;

import com.studentDetails.entity.StudentEntity;
import com.studentDetails.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/get")
    public List<StudentEntity> getStudentDetails(){
        return (List<StudentEntity>) studentRepository.findAll();

    }

    @PostMapping("/post")
    public StudentEntity saveStudentDetails(@RequestBody StudentEntity entity){
        return studentRepository.save(entity);
    }
}
