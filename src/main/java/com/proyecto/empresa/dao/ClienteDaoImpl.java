package com.proyecto.empresa.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;


import com.proyecto.empresa.model.Cliente;
import com.proyecto.empresa.model.Cotizacion;

@Repository
@Transactional
public class ClienteDaoImpl extends AbstractSession implements ClienteDao{

	
	@Override
	public void saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		getSession().persist(cliente);
	}
	
	@Override
	public void deleteCliente(Long idCliente) {
		// TODO Auto-generated method stub
		
		
		Cliente cliente= findById(idCliente);
		if(cliente!=null) {
			
			Iterator<Cotizacion> i = cliente.getCotizacion().iterator();
			while(i.hasNext()) {
				Cotizacion cotizacion = i.next();
				i.remove();
				getSession().delete(cotizacion);
			}
			cliente.getCotizacion().clear();
			getSession().delete(cliente);
		}
	}

	@Override
	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		getSession().update(cliente);
	}

	@Override
	public List<Cliente> findAllCliente() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Cliente").list();
	}

	@Override
	public Cliente findById(Long idCliente) {
		// TODO Auto-generated method stub
		return (Cliente) getSession().get(Cliente.class,idCliente);
	}

	@Override
	public Cliente findByName(String razonSocial) {
		// TODO Auto-generated method stub
		return (Cliente) getSession().createQuery("from Cliente where razonSocial = :razonSocial").setParameter("razonSocial", razonSocial).uniqueResult();
	}



}
