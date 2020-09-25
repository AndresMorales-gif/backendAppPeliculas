/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author Andres Morales
 */
@Entity
@Table(name="movies")
public class Movie {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    private Integer idMovie;
    
    private String title;
    
    private String description;
    
    private String kind;
    
    private String image;
    
    @Column(name = "serie_or_movie")
    private Integer serieOrMovie;
    
    @OneToMany(mappedBy="movie")
    private List<Qualification> qualifications;
    
    public Movie() {
    }    

    public Movie(String title, String description, String kind, String image, Integer serieOrMovie) {
        this.title = title;
        this.description = description;
        this.kind = kind;
        this.image = image;
        this.serieOrMovie = serieOrMovie;
    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getSerieOrMovie() {
        return serieOrMovie;
    }

    public void setSerieOrMovie(Integer serieOrMovie) {
        this.serieOrMovie = serieOrMovie;
    }
    
    
}
