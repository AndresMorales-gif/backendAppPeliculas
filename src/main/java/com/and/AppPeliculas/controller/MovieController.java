/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.controller;

import com.and.AppPeliculas.entity.Movie;
import com.and.AppPeliculas.service.IMovieService;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andres Morales
 */

@RestController
@RequestMapping("/movie")
public class MovieController {
    
    @Autowired
    private IMovieService movieService;
    
    @PostMapping("/save")
    public Movie save(@RequestBody Movie movie) {
        System.out.println(movie);
        movieService.save(movie);
        return movie;
    }
    
    @GetMapping("/update")
    public Movie update(@RequestBody Movie movie) {
        movieService.update(movie);
        return movie;
    }
    
    @GetMapping("/all")
    public List<Movie> allMovies() {
        List<Movie> movies = movieService.findAll();
        return movies;
    }
}
