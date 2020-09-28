/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.service;

import com.and.AppPeliculas.dao.IQualificationDao;
import com.and.AppPeliculas.entity.Movie;
import com.and.AppPeliculas.entity.Qualification;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Morales
 */
@Service
public class QualificationServiceImpl implements IQualificationService {

    @Autowired
    private IQualificationDao qualificationDao;    
    
    @Override
    public void save(Qualification qualification) {
        try {
            qualificationDao.save(qualification);
        } catch (Exception e) {
            throw new RuntimeException("No se logro guardar los datos de la calificacion hecha.");
        } 
    }

    @Override
    public void update(Qualification qualification) {
        try {
            qualificationDao.save(qualification);
        } catch (Exception e) {
            throw new RuntimeException("No se logro actualizar los datos de la calificacion hecha.");
        }
    }

    @Override
    public void delete(Integer idQualification) {
        try {
            qualificationDao.deleteById(idQualification);
        } catch (Exception e) {
            throw new RuntimeException("No se logro eliminar los datos de la calificacion hecha.");
        }
    }

    @Override
    public List<Qualification> findAll() {
        try {
            return (List)qualificationDao.findAll();
        } catch (Exception e) {
            throw new RuntimeException("No se logro recuperar los datos de todas las calificaciones hechas.");
        }
    }

    @Override
    public Optional<Qualification> findById(Integer idQualification) {
        try {
            return qualificationDao.findById(idQualification);
        } catch (Exception e) {
            throw new RuntimeException("No se logro recuperar el dato de la calificacion hecha.");
        }
    }

    @Override
    public List<Integer> topQualifications() {
        try {
            return (List)qualificationDao.topQualifications();
        } catch (Exception e) {
            throw new RuntimeException("No se logro recuperar los datos de todas las calificaciones hechas.");
        }
    }
    
}
