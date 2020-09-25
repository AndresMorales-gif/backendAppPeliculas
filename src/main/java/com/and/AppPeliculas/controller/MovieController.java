/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.controller;

import com.and.AppPeliculas.entity.Movie;
import com.and.AppPeliculas.service.IMovieService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andres Morales
 */

@RestController
@RequestMapping("/pelicula")
public class MovieController {
    
    @Autowired
    private IMovieService movieService;
    
    @GetMapping("/save")
    public Movie save() {
        Movie movie = new Movie("La bella y la bestia", "Un hombre feo que quiere una princesa", "drama", "/hola.jpg", 0);
        movieService.save(movie);
        return movie;
    }
    /*
    @GetMapping("/update")
    public Movie update() {
        Optional<Movie> movie = movieService.findById(2);
        movieService.update(movie);
        return movie;
    }*/
    
    @GetMapping("/todas")
    public List<Movie> allMovies() {
        List<Movie> movies = movieService.findAll();
        return movies;
    }
}
