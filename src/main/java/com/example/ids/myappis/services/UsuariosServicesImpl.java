package com.example.ids.myappis.services;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ids.myappis.entities.Usuarios;
import com.example.ids.myappis.repositories.UsuariosRespository;

@Service
public class UsuariosServicesImpl implements UsuariosService{
	
	@Autowired
	private UsuariosRespository repository;
 
	@Override
	public List<Usuarios> consultaUsuarios(){
		return repository.findAll();
	}
 
	@Override
	public Usuarios consultaUsuarios(Long userId) {
		Optional<Usuarios> users = repository.findById(userId);
		if(users.isPresent()) {
			return users.get();
		}
		return new Usuarios();
	}

	@Override
	public void guardarUsuarios(Usuarios users) {
		// TODO Generación automática de código auxiliar
		repository.save(users);
	}

	@Override
	public void borrarUsuarios(Long userId) {
		// TODO Generación automática de código auxiliar
		repository.deleteById(userId);
	}

	@Override
	public void actualizarUsuarios(Usuarios users) {
		// TODO Generación automática de código auxiliar
		repository.save(users);
	 
	}
	
}
