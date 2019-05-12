package com.example.ids.myappis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ids.myappis.entities.Usuarios;
import com.example.ids.myappis.services.UsuariosService;

@RestController
@CrossOrigin
public class UsuariosRestController {

	@Autowired
	private UsuariosService service;
	
	@GetMapping("/api/usuarios")
	public List<Usuarios> consultaUsuarios(){
		System.out.println("Lista de alumnos ");
		List<Usuarios> users = service.consultaUsuarios();
		System.out.println("Lista de usuarios " + users);
		return users;
	}
	
	@GetMapping("/api/usuarios/{userId}")
	public Usuarios consultaAlumno(@PathVariable(name="userId") Long userId) {
		Usuarios user = service.consultaUsuarios(userId);
		System.out.println("Usuario encontrado: " + user);
		return user;
	}
	
	@PostMapping("/api/usuarios")
	public void guardarUsuarios(@RequestBody Usuarios users) {
		service.guardarUsuarios(users);
		System.out.println("Usuario guardado");
	}
	
	@DeleteMapping("/api/usuarios/{userId}")
	public void borrarUsuarios(@PathVariable(name="userId") Long userId) {
		service.borrarUsuarios(userId);
		System.out.println("Usuario borrado: " + userId);
	}
	
	@PutMapping("/api/usuarios/{userId}")
	public void actualizaUsuarios(@RequestBody Usuarios users, @PathVariable(name="userId") Long userId) {
		service.guardarUsuarios(users);
		System.out.println("Usuario actualizado");
	}
}
