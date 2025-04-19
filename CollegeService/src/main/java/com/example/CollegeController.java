package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

    @Autowired
    StudentFeign studentFeign;

    @GetMapping("/college/getStudentName")
    public String getStudentName(){
        return studentFeign.getStudentName();
    }
}
