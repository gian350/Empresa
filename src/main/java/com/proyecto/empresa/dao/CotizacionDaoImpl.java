package com.proyecto.empresa.dao;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import com.proyecto.empresa.model.Cliente;
import com.proyecto.empresa.model.Cotizacion;

@Repository
@Transactional
public class CotizacionDaoImpl extends AbstractSession implements CotizacionDao{

	
	@Override
	public void saveCotizacion(Cotizacion cotizacion) {
		// TODO Auto-generated method stub
		getSession().persist(cotizacion);
	}

	@Override
	public void deleteCotizacionById(Long idCotizacion) {
		// TODO Auto-generated method stub
		Cotizacion cotizacion= findById(idCotizacion);
		if(cotizacion!=null) {
			getSession().delete(cotizacion);
		}
	}

	@Override
	public void updateCotizacion(Cotizacion cotizacion) {
		// TODO Auto-generated method stub
		getSession().update(cotizacion);
	}

	@Override
	public List<Cotizacion> findAllCotizacion() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Cotizacion").list();
	}

	@Override
	public Cotizacion findById(Long idCotizacion) {
		// TODO Auto-generated method stub
		return (Cotizacion) getSession().get(Cotizacion.class,idCotizacion);
	}

	@Override
	public List<Cotizacion> findByIdCliente(Long idCliente) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Cotizacion c join c.cliente t where t.idCliente = :idCliente").setParameter("idCliente", idCliente).list();
	}

}
