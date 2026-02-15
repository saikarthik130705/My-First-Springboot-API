package com.example.studentAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@RestController
public class HelloController {

    private List<Student> students = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> getStudent() {
        
        return students;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

    
}
