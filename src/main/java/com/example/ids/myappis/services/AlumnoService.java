package com.example.ids.myappis.services;

import java.util.List;

import com.example.ids.myappis.entities.Alumno;

public interface AlumnoService {
	
	List<Alumno> consultaAlumno();
	Alumno consultaAlumno(Long alumnoId);
	void guardarAlumno(Alumno alumno);
	void borrarAlumno(Long alumnoId);
	void actualizarAlumno(Alumno alumno);

}
