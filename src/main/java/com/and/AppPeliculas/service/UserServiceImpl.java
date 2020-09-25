/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.service;

import com.and.AppPeliculas.dao.IUserDao;
import com.and.AppPeliculas.entity.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Morales
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    
    @Override
    public void save(User user) {
        try {
            userDao.save(user);
        } catch (Exception e) {
            throw new RuntimeException("No se logro guardar los datos del usuario ingresado.");
        } 
    }

    @Override
    public void update(User user) {
        try {
            userDao.save(user);
        } catch (Exception e) {
            throw new RuntimeException("No se logro actualizar los datos del usuario ingresado.");
        }
    }

    @Override
    public void delete(Integer idUser) {
        try {
            userDao.deleteById(idUser);
        } catch (Exception e) {
            throw new RuntimeException("No se logro eliminar los datos del usuario ingresado.");
        }
    }

    @Override
    public List<User> findAll() {
        try {
            return (List)userDao.findAll();
        } catch (Exception e) {
            throw new RuntimeException("No se logro recuperar los datos de todos los usuario ingresado.");
        }
    }

    @Override
    public Optional<User> findById(Integer idUser) {
        try {
            return userDao.findById(idUser);
        } catch (Exception e) {
            throw new RuntimeException("No se logro guardar los datos del usuario ingresado.");
        }
    }
    
}
