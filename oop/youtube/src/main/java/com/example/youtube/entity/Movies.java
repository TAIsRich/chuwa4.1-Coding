package com.example.youtube.entity;

import javax.persistence.*;

@Entity
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "MOVIE_ID_SEQ")
    @SequenceGenerator(sequenceName = "movie_seq", allocationSize = 1, name="MOVIE_ID_SEQ", initialValue = 10)
    Long id;

    @Column(name = "Movie_Name")
    String movie_name;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

}
