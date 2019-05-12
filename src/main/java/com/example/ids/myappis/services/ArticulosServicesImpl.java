package com.example.ids.myappis.services;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ids.myappis.entities.Articulos;
import com.example.ids.myappis.repositories.ArticulosRespository;

@Service
public class ArticulosServicesImpl implements ArticulosService{
	
	@Autowired
	private ArticulosRespository repository;
 
	@Override
	public List<Articulos> consultaArticulos(){
		return repository.findAll();
	}
 
	@Override
	public Articulos consultaArticulos(Long articulosId) {
		Optional<Articulos> articulos = repository.findById(articulosId);
		if(articulos.isPresent()) {
			return articulos.get();
		}
		return new Articulos();
	}
	
	@Override
	public void guardarArticulos(Articulos articulos) {
		// TODO Generación automática de código auxiliar
		repository.save(articulos);
	}

	@Override
	public void borrarArticulos(Long articulosId) {
		// TODO Generación automática de código auxiliar
		repository.deleteById(articulosId);
	}

	@Override
	public void actualizarArticulos(Articulos articulos) {
		// TODO Generación automática de código auxiliar
		repository.save(articulos);
	 
	}

}
