package com.example.springrestfuldemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class SortController {


    @GetMapping("/sort")
    public List<String> sort(
            @RequestParam(value = "words", defaultValue = "") List<String> words) {
        Collections.sort(words);
        return words;
    }
}
