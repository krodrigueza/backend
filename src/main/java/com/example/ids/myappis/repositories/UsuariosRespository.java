package com.example.ids.myappis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ids.myappis.entities.Usuarios;

@Repository
public interface UsuariosRespository extends JpaRepository<Usuarios, Long> {

}
