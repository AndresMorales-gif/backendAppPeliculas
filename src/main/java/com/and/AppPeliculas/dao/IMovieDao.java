/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.dao;

import com.and.AppPeliculas.entity.Movie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Andres Morales
 */
public interface IMovieDao extends JpaRepository<Movie, Integer> {
    public List<Movie> findAllByOrderByLaunchingAsc();
}
