package com.example.ids.myappis.services;

import java.util.List;

import com.example.ids.myappis.entities.Articulos;

public interface ArticulosService {
	
	List<Articulos> consultaArticulos();
	Articulos consultaArticulos(Long articulosId);
	void guardarArticulos(Articulos articulos);
	void borrarArticulos(Long articulosId);
	void actualizarArticulos(Articulos articulos);

}
