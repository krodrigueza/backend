package com.example.ids.myappis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ids.myappis.entities.Articulos;

@Repository
public interface ArticulosRespository extends JpaRepository<Articulos, Long>{

}
