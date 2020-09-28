/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.service;

import com.and.AppPeliculas.entity.Movie;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andres Morales
 */


public interface IMovieService {
    
    public void save(Movie movie);
    
    public void update(Movie movie);
    
    public void delete(Integer idMovie);
    
    public List<Movie> findAll();
   
    public List<Movie> findAllOrderByLaunchingAsc();
    
    public Optional<Movie> findById(Integer idMovie);
    
}
