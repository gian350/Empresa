package com.proyecto.empresa.dao;

import java.util.List;

import com.proyecto.empresa.model.Cliente;


public interface ClienteDao {
	void saveCliente(Cliente cliente);
	
	void deleteCliente(Long idCliente);
	
	void updateCliente(Cliente cliente);
	
	List<Cliente>findAllCliente();
	
	Cliente findById(Long idCliente);
	
	Cliente findByName(String razonSocial);
	
}
/*
void saveTeacher(Teacher teacher);

void deleteTeacherById(Long idTeacher);

void updateTeacher(Teacher teacher);

List<Teacher>findAllTeachers();

Teacher findById(Long idTeacher);

Teacher findByName(String name);*/