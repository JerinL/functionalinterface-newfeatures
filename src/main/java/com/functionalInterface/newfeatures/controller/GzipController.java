package com.functionalInterface.newfeatures.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/getemp")
public class GzipController {

    @GetMapping()
    public List<EmpRecord> getAllEmp(){
        List<String> gender = Arrays.asList("male","female","other");
        List<String> departments = Arrays.asList("HR", "Finance", "Engineering", "Sales", "Marketing");
        List<String> skills = Arrays.asList("Java", "Spring Boot", "SQL", "Kafka", "MongoDB");

        return IntStream.rangeClosed(1,100000).mapToObj(i ->
                new EmpRecord("emp"+i,
                        "name"+i,
                        gender.get(new Random().nextInt(gender.size())),
                        departments.get(new Random().nextInt(departments.size())),
                        skills.get(new Random().nextInt(skills.size()))
                )
                ).collect(Collectors.toList());
    }
}
