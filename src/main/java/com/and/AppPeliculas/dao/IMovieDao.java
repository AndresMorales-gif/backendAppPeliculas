/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.dao;

import com.and.AppPeliculas.entity.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Andres Morales
 */
public interface IMovieDao extends CrudRepository<Movie, Integer> {
    
}
