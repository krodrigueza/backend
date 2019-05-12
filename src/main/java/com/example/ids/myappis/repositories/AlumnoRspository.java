package com.example.ids.myappis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ids.myappis.entities.Alumno;

/*
 * Este documento permite hacer busquedas en SQL
 * */

@Repository
public interface AlumnoRspository extends JpaRepository<Alumno, Long>{

}
