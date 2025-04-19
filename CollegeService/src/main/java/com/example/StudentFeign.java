package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "studentFeign" , url = "http://localhost:6603")
public interface StudentFeign {

    @GetMapping("/getStudentName")
    public String getStudentName();
}
