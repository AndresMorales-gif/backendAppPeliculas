/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.service;

import com.and.AppPeliculas.entity.Movie;
import com.and.AppPeliculas.entity.Qualification;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andres Morales
 */
public interface IQualificationService {
    
    public void save(Qualification qualification);
    
    public void update(Qualification qualification);
    
    public void delete(Integer idQualification);
    
    public List<Qualification> findAll();
    
    public Optional<Qualification> findById(Integer idQualification);
    
    public List<Integer> topQualifications(); 
}
