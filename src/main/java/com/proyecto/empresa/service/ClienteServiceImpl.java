package com.proyecto.empresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.empresa.dao.ClienteDao;
import com.proyecto.empresa.model.Cliente;

@Service("clienteService")
@Transactional
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDao _clienteDao;
	// llama a la unica implementacion de la interfaz ClienteDao y lo inyecta a _clienteDao
	
	@Override
	public void saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		_clienteDao.saveCliente(cliente);
	}
	
	@Override
	public void deleteCliente(Long idCliente) {
		// TODO Auto-generated method stub
		_clienteDao.deleteCliente(idCliente);
	}

	@Override
	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		_clienteDao.updateCliente(cliente);
	}

	@Override
	public List<Cliente> findAllCliente() {
		// TODO Auto-generated method stub
		return _clienteDao.findAllCliente();
	}

	@Override
	public Cliente findById(Long idCliente) {
		// TODO Auto-generated method stub
		return _clienteDao.findById(idCliente);
	}

	@Override
	public Cliente findByName(String razonSocial) {
		// TODO Auto-generated method stub
		return _clienteDao.findByName(razonSocial);
	}



}
