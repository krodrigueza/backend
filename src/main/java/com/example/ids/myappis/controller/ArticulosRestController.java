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

import com.example.ids.myappis.entities.Articulos;
import com.example.ids.myappis.services.ArticulosService;

@RestController
@CrossOrigin
public class ArticulosRestController {

	@Autowired
	private ArticulosService service;
	
	@GetMapping("/api/articulos")
	public List<Articulos> consultaArticulos(){
		System.out.println("Lista de articulos ");
		List<Articulos> articulos = service.consultaArticulos();
		System.out.println("Lista de usuarios " + articulos);
		return articulos;
	}
	
	@GetMapping("/api/articulos/{articulosId}")
	public Articulos consultaArticulos(@PathVariable(name="articulosId") Long articulosId) {
		Articulos articulo = service.consultaArticulos(articulosId);
		System.out.println("Articulo encontrado: " + articulo);
		return articulo;
	}
	
	@PostMapping("/api/articulos")
	public void guardarArticulos(@RequestBody Articulos articulos) {
		service.guardarArticulos(articulos);
		System.out.println("Articulos guardado");
	}
	
	@DeleteMapping("/api/articulos/{articulosId}")
	public void borrarArticulos(@PathVariable(name="articulosId") Long articulosId) {
		service.borrarArticulos(articulosId);
		System.out.println("Articulo borrado: " + articulosId);
	}
	
	@PutMapping("/api/articulos/{userId}")
	public void actualizaArticulos(@RequestBody Articulos articulos, @PathVariable(name="articulosId") Long articulosId) {
		service.guardarArticulos(articulos);
		System.out.println("Articulos actualizado");
	}
	
}
