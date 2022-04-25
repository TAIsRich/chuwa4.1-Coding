package com.dfy.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/25/22 12:06 AM
 */

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Sarah", "d592u");

    }

    @GetMapping("/student/{name}/{id}")
    public Student studentPathVariable(
            @PathVariable("name") String name,
            @PathVariable("id") String id) {
        return new Student(name, id);
    }


    //Take list of string and sort it by alphabetical order.
    @GetMapping("/students/sort")
    public ArrayList<String> sortStudent(@RequestParam("names") ArrayList<String> names) {
        Collections.sort(names);
        return names;
    }





}
