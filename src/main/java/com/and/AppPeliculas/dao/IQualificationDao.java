/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.and.AppPeliculas.dao;

import com.and.AppPeliculas.entity.Qualification;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 *
 * @author Andres Morales
 */
public interface IQualificationDao extends JpaRepository<Qualification, Integer> {
   
    @Query(value="select a.id_movie, a.title, a.kind, a.image, a.serie_or_movie, a.launching, a.description from "
            + "(select m.id_movie, m.title, m.description, m.kind, m.image, m.serie_or_movie, m.launching, avg(q.qualification) "
            + "as avQ from qualifications as q left join movies as m on q.id_movie = m.id_movie group by q.id_movie order by avQ desc limit 4) as a", 
            nativeQuery=true)
    public List<Integer> topQualifications();
}
