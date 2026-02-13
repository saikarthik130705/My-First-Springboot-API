package com.example.studentAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HelloController {

    @GetMapping("/student")
    public List<Student> getStudent() {
        Student s1 = new Student(1, "Sai Karthik", 20);
        Student s2 = new Student(2, "Sai Dharshan", 19);
        Student s3 = new Student(3, "Yashwanthi", 45);

        return Arrays.asList(s1, s2, s3);
    }
}
