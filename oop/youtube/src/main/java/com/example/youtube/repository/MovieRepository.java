package com.example.youtube.repository;

import com.example.youtube.entity.Movies;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movies, Long> {
    @Query("SELECT M FROM Movies M WHERE M.movie_name = :movie_name")
    Movies findByName(@Param("movie_name") String movie_name);

    @Query("SELECT M FROM Movies M WHERE M.id = :id") //why we can use :id
    Movies findById(@Param("id") String id);

    List<Movies> findAll();
}
