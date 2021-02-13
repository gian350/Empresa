package com.proyecto.empresa.service;

import java.util.List;

import com.proyecto.empresa.model.Cliente;

public interface ClienteService {
	
	void saveCliente(Cliente cliente);
	
	void updateCliente(Cliente cliente);
	
	void deleteCliente(Long idCliente);
	
	List<Cliente>findAllCliente();
	
	Cliente findById(Long idCliente);
	
	Cliente findByName(String razonSocial);
}
