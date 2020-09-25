/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Andres Morales
 */
@Entity
@Table(name="qualifications")
public class Qualification {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_qualification")
    private Integer idQualification;
    
    @ManyToOne
    @JoinColumn(name="id_movie", insertable=false, updatable=false)
    private Movie movie;
    
    @ManyToOne
    @JoinColumn(name="id_user", insertable=false, updatable=false)
    private User user;
    
    private Integer qualification;

    public Qualification() {
    }

    public Qualification(Movie movie, User user, Integer qualification) {
        this.movie = movie;
        this.user = user;
        this.qualification = qualification;
    }    
    
    public Integer getIdQualification() {
        return idQualification;
    }

    public void setIdQualification(Integer idQualification) {
        this.idQualification = idQualification;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getQualification() {
        return qualification;
    }

    public void setQualification(Integer qualification) {
        this.qualification = qualification;
    }
    
    
}
