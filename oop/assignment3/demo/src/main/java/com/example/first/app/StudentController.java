package com.example.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {

    @GetMapping
    public Student student() {
        return new Student("Di", "Zhou");
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Di", "Zhou"));
        students.add(new Student("Tony", "Smith"));
        students.add(new Student("Aaron", "Green"));
        students.add(new Student("Alex", "White"));

        return students;
    }

    @GetMapping("student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }

    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }

    @GetMapping("student/test/{firstName}/{lastName}")
    public Student studentPathVariableTEST(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
