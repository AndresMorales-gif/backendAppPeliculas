/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.service;

import com.and.AppPeliculas.entity.User;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andres Morales
 */
public interface IUserService {
    
    public void save(User user);
    
    public void update(User user);
    
    public void delete(Integer idUser);
    
    public List<User> findAll();
    
    public Optional<User> findById(Integer idUser);
    
}
