package com.example.youtube;

public class Content {
    private String title;
    private String length;
    private String description;
    private Integer year;


    public Content(String title, String length, String description, int year) {
        this.title = title;
        this.length = length;
        this.description = description;
        this.year = year;
    }


    public String getTitle() {
        return this.title;
    }
    public String getLength() {
        return this.length;
    }
    public String getDescription() {
        return this.description;
    }

    public Integer getYear() {
        return this.year;
    }
}
