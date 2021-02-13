package com.proyecto.empresa.dao;

import java.util.List;

import com.proyecto.empresa.model.Cotizacion;


public interface CotizacionDao {
	
	void saveCotizacion(Cotizacion cotizacion);
	
	void deleteCotizacionById(Long idCotizacion);
	
	void updateCotizacion(Cotizacion cotizacion);
	
	List<Cotizacion>findAllCotizacion();
	
	Cotizacion findById(Long idCotizacion);
	
	List<Cotizacion> findByIdCliente(Long idCliente);
}
/*
void saveCourse(Course course);

void deleteCourseById(Long idCourse);

void updateCourse(Course course);

List<Course>findAllCourse();

Course findById(long idCourse);

Course findByName(String name);

List<Course> findByIdTeacher(Long idTeacher);*/