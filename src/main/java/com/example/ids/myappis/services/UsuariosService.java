package com.example.ids.myappis.services;

import java.util.List;

import com.example.ids.myappis.entities.Usuarios;

public interface UsuariosService {

	List<Usuarios> consultaUsuarios();
	Usuarios consultaUsuarios(Long userId);
	void guardarUsuarios(Usuarios users);
	void borrarUsuarios(Long userId);
	void actualizarUsuarios(Usuarios users);
	
}
