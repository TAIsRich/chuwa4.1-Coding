package com.example.restserviceproject.services;

import com.example.restserviceproject.models.Tweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweet")
public class TweetController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public Tweet getTweet(@PathVariable int id) {
        return new Tweet(id, "Hello Tweet No." + id);
    }
}
