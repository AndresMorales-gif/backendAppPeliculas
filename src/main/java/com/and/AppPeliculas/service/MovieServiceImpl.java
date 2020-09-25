/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.service;

import com.and.AppPeliculas.dao.IMovieDao;
import com.and.AppPeliculas.entity.Movie;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Morales
 */
@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private IMovieDao movieDao;
    
    @Override    
    public void save(Movie movie) {
        try {
            movieDao.save(movie);
        } catch (Exception e) {
            throw new RuntimeException("No se logro guardar los datos de la pelicula ingresada.");
        }       
    }

    @Override
    public void update(Movie movie) {
        try {
            movieDao.save(movie);
        } catch (Exception e) {
            throw new RuntimeException("No se logro actualizar los datos de la pelicula ingresada.");
        }
    }

    @Override
    public void delete(Integer idMovie) {
        try {
            movieDao.deleteById(idMovie);
        } catch (Exception e) {
            throw new RuntimeException("No se logro eliminar la pelicula ingresada.");
        }
    }

    @Override
    public List<Movie> findAll() {
        try {
            return (List)movieDao.findAll();
        } catch (Exception e) {
            throw new RuntimeException("No se logro recuperar los datos de todas las peliculas.");
        }
    }

    @Override
    public Optional<Movie> findById(Integer idMovie) {
        try {
            return movieDao.findById(idMovie);
        } catch (Exception e) {
            throw new RuntimeException("No se logro encontrar la pelicula solicitada.");
        }
    }
    
}
