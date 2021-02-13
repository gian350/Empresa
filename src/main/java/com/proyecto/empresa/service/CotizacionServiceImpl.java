package com.proyecto.empresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.empresa.dao.CotizacionDao;
import com.proyecto.empresa.model.Cotizacion;

@Service("cotizacionService")
@Transactional
public class CotizacionServiceImpl implements CotizacionService{
	
	@Autowired
	private CotizacionDao _cotizacionDao;
	
	@Override
	public void saveCotizacion(Cotizacion cotizacion) {
		// TODO Auto-generated method stub
		_cotizacionDao.saveCotizacion(cotizacion);
	}

	@Override
	public void deleteCotizacionById(Long idCotizacion) {
		// TODO Auto-generated method stub
		_cotizacionDao.deleteCotizacionById(idCotizacion);
	}

	@Override
	public void updateCotizacion(Cotizacion cotizacion) {
		// TODO Auto-generated method stub
		_cotizacionDao.updateCotizacion(cotizacion);
	}

	@Override
	public List<Cotizacion> findAllCotizacion() {
		// TODO Auto-generated method stub
		return _cotizacionDao.findAllCotizacion();
	}

	@Override
	public Cotizacion findById(Long idCotizacion) {
		// TODO Auto-generated method stub
		return _cotizacionDao.findById(idCotizacion);
	}

	@Override
	public List<Cotizacion> findByIdCliente(Long idCliente) {
		// TODO Auto-generated method stub
		return _cotizacionDao.findByIdCliente(idCliente);
	}

}
