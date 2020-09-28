/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.controller;

import com.and.AppPeliculas.entity.Movie;
import com.and.AppPeliculas.entity.Qualification;
import com.and.AppPeliculas.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.and.AppPeliculas.service.IQualificationService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Andres Morales
 */
@RestController
@RequestMapping("/qualification")
public class QualificationController {
    
    @Autowired
    private IQualificationService qualificationService;
    
    @Autowired
    private IMovieService movieService;
    
    @PostMapping("/save")
    public Qualification save(@RequestBody Qualification qualification){
        qualificationService.save(qualification);
        return qualification;
    }
    
    @GetMapping("/top")
    public List<Optional<Movie>> top(){
        List<Integer> idMovies = qualificationService.topQualifications();
        List<Optional<Movie>> movies = new ArrayList<>();
        idMovies.forEach(idMovie -> {
            movies.add(movieService.findById(idMovie));
        });
        return movies;
    }
    
}
